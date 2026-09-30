public class Autobus
{
    private String kennzeichen;
    private int sitzplaetze;
    private boolean anhaenger;
    
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }
    
    public void setSitzplaetze(int neuSitzplaetze)
    {
        sitzplaetze = neuSitzplaetze;
    }
    
    public void setAnhaenger(boolean neuAnhaenger)
    {
        anhaenger = neuAnhaenger;
    }
    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    
    public int getSitzplaetze()
    {
        return sitzplaetze;
    }
}