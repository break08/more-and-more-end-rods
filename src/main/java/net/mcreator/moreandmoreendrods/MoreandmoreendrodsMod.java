package net.mcreator.moreandmoreendrods;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.server.TickTask;

import net.mcreator.moreandmoreendrods.init.*;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.api.ModInitializer;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class MoreandmoreendrodsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger(MoreandmoreendrodsMod.class);
	public static final String MODID = "moreandmoreendrods";

	@Override
	public void onInitialize() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		LOGGER.info("Initializing MoreandmoreendrodsMod");
		MoreandmoreendrodsModBlocks.load();
		MoreandmoreendrodsModBlockEntities.load();
		MoreandmoreendrodsModItems.load();
		MoreandmoreendrodsModTabs.load();
		MoreandmoreendrodsModVillagerProfessions.load();
		MoreandmoreendrodsModTrades.registerTrades();
		MoreandmoreendrodsModMenus.load();
		tick();
		new net.mcreator.moreandmoreendrods.procedures.CopperEndRodOnTickUpdateProcedure();
		new net.mcreator.moreandmoreendrods.procedures.CopperEndRodOnBlockRightclickedProcedure();
		new net.mcreator.moreandmoreendrods.procedures.CactusEndRodEntityCollidesInTheBlockProcedure();
		new net.mcreator.moreandmoreendrods.procedures.DispenserEndRodRedstoneOnOffProcedure();
		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private record ScheduledTask(Runnable action, int delay) {
	}

	private record TickTask(int tick, Runnable action) {
	}

	private static final Queue<ScheduledTask> pendingTasks = new ConcurrentLinkedQueue<>();
	private static final PriorityQueue<TickTask> runningTasks = new PriorityQueue<>(Comparator.comparingInt(TickTask::tick));

	public static void queueServerWork(int delay, Runnable action) {
		pendingTasks.add(new ScheduledTask(action, delay));
	}

	private void tick() {
		ServerTickEvents.END_SERVER_TICK.register(server -> {
			int currentTick = server.getTickCount();
			ScheduledTask scheduled;
			while ((scheduled = pendingTasks.poll()) != null) {
				runningTasks.add(new TickTask(currentTick + scheduled.delay(), scheduled.action()));
			}
			while (!runningTasks.isEmpty() && currentTick >= runningTasks.peek().tick()) {
				runningTasks.poll().action().run();
			}
		});
	}
	// Start of user code block mod static methods
	// End of user code block mod static methods
}