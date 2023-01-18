public class Landline implements Phone {
    private String myphoneNo;
    private boolean isRinging;
    private boolean isPoweron;

    public Landline(String phoneNo) {
        this.myphoneNo = phoneNo;
        isRinging=false;
        isPoweron=true;
    }

    public String getPhoneNo() {
        return myphoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.myphoneNo = phoneNo;
    }
    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPoweron() {
        return isPoweron;
    }

    public void setPoweron(boolean poweron) {
        isPoweron = poweron;
    }

    @Override
    public void powerOn() {
        this.isPoweron=true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPoweron==true){
            System.out.println("you are dialling to the no:"+phoneNo);
        }else{
            System.out.println("your mobile is off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPoweron && myphoneNo.equals(phoneNo)){
            isRinging=true;
            System.out.println("hey"+phoneNo+"you are receving a call");
        }else{
            System.out.println("call not received");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call answered");
            this.isRinging=false;
            return true;
        }
            return false;
    }

    public boolean isRinging() {
        return isRinging;
    }




}
