package agents.sergeyKarakovskiy;

import engine.core.MarioAgent;
import engine.core.MarioEvent;
import engine.core.MarioForwardModel;
import engine.core.MarioTimer;
import engine.helper.MarioActions;

import java.util.ArrayList;

/**
 * @author SergeyKarakovskiy
 */
public class Agent implements MarioAgent {
    private boolean[] actions = null;

    @Override
    public void initialize(MarioForwardModel model, MarioTimer timer) {
        actions = new boolean[MarioActions.numberOfActions()];
        actions[MarioActions.RIGHT.getValue()] = true;
        actions[MarioActions.SPEED.getValue()] = true;
    }

    @Override
    public boolean[] getActions(MarioForwardModel model, MarioTimer timer, ArrayList<MarioEvent> gameEvents) {
        actions[MarioActions.SPEED.getValue()] = actions[MarioActions.JUMP.getValue()] = model.mayMarioJump() || !model.isMarioOnGround();
        return actions;
    }

    @Override
    public String getAgentName() {
        return "SergeyKarakovskiyAgent";
    }
}
