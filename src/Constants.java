import java.util.HashMap;
import java.util.Map;

class Constants {

/*     public static final Map<Integer, String> TIMER_OR_CUSTOM;
    static { 
        Map<Integer, String> TimerOrCustom = new HashMap<Integer, String>();
        TimerOrCustom.put(1, "5 min box / 1 min rest");
        TimerOrCustom.put(2, "3 min box / 1 min rest");
        TimerOrCustom.put(3, "1 min box / 10 sec rest");
        TimerOrCustom.put(4, "Custom");
        TIMER_OR_CUSTOM = TimerOrCustom; //If you leave out this line, the values will not be assigned to ORTHODOX_OR_SOUTHPAW, and it will remain 'null' after exectution
    } */

/*     public static final Map<Integer, String> ORTHODOX_OR_SOUTHPAW;
    static { 
        Map<Integer, String> orthodoxOrSouthpaw = new HashMap<Integer, String>();
        orthodoxOrSouthpaw.put(1, "Orthodox");
        orthodoxOrSouthpaw.put(2, "Southpaw");
        ORTHODOX_OR_SOUTHPAW = orthodoxOrSouthpaw;
    } */
    
    public static final Map<Integer, String> DIFFICULTY_LEVEL;
    static { 
        Map<Integer, String> difficultyLevel = new HashMap<Integer, String>();
        difficultyLevel.put(1, "Beginner");
        difficultyLevel.put(2, "Intermediate");
        difficultyLevel.put(3, "Advanced");
        DIFFICULTY_LEVEL = difficultyLevel;
    }

    public static final Map<Integer, String> ORTHODOX_STANCE_PUNCHES;
    static {
        Map<Integer, String> orthodoxStancePunches = new HashMap<Integer, String>();
        orthodoxStancePunches.put(1, "Jab");
        orthodoxStancePunches.put(2, "Cross");
        orthodoxStancePunches.put(3, "Lead Hook");
        orthodoxStancePunches.put(4, "Rear Hook");
        orthodoxStancePunches.put(5, "Lead Uppercut");
        orthodoxStancePunches.put(6, "Rear Uppercut");
        ORTHODOX_STANCE_PUNCHES = orthodoxStancePunches;
    }

    public static final Map<Integer, String> SOUTHPAW_STANCE_PUNCHES;
    static {
        Map<Integer, String> southpawStancePunches = new HashMap<Integer, String>();
        southpawStancePunches.put(1, "Cross");
        southpawStancePunches.put(2, "Jab");
        southpawStancePunches.put(3, "Rear Hook");
        southpawStancePunches.put(4, "Lead Hook");
        southpawStancePunches.put(5, "Rear Uppercut");
        southpawStancePunches.put(6, "Lead Uppercut");
        SOUTHPAW_STANCE_PUNCHES = southpawStancePunches;
    }

}


