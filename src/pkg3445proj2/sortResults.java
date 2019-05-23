package pkg3445proj2;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Chase Uphaus
 */
public class sortResults
{
    private int sizeOfList;
    private long amtComp, amtSwap;
    private long timeTaken;
    private String sortMethod;
    private String order;
    String HMS;
    public sortResults(int s, long ac, long as, long tt, String sm, String or)
    {
        this.sizeOfList = s;
        this.amtComp = ac;
        this.amtSwap = as;
        this.timeTaken = tt;
        this.sortMethod = sm;
        this.order = or;
        this.HMS = (String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(timeTaken),
    TimeUnit.MILLISECONDS.toMinutes(timeTaken) % TimeUnit.HOURS.toMinutes(1),
    TimeUnit.MILLISECONDS.toSeconds(timeTaken) % TimeUnit.MINUTES.toSeconds(1)));
    }
    
    public int getSize() { return sizeOfList; }
    public long getComp() {return amtComp;}
    public long getSwap() {return amtSwap;}
    public long getTime() {return timeTaken;}
    public String getMethod() {return sortMethod;}
    public String getOrder() {return order;}
    public String getHMSTime() {return  HMS;}
}
