//import java.util.Map;

public class BoxingSession {

    private int _numOfRounds;
    private int _timeOfRounds;
    private int _restTime;
    private int _roundEndWarning;

    public int getNumOfRounds(){
        return _numOfRounds;
    }
    public void setNumOfRounds(int numOfRounds){
        _numOfRounds = numOfRounds;
    }

    public int getTimeOfRounds(){
        return _timeOfRounds;
    }
    public void setTimeOfRounds(int timeOfRounds){
       _timeOfRounds = timeOfRounds;
    }

    public int getRestTime(){
        return _restTime;
    }
    public void setRestTime(int restTime){
        _restTime = restTime;
    }

    public int getRoundEndWarning(){
        return _roundEndWarning;
    }
    public void setRoundEndWarning(int roundEndWarning){
        _roundEndWarning = roundEndWarning;
    }
}

