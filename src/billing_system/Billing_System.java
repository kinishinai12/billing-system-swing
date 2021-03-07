
package billing_system;


public class Billing_System {

    // load the screen
    protected static void loadTheScreen(){
        
        LoadingScreen loadingScreen = new LoadingScreen();
        
        loadingScreen.setVisible(true);
        loadingScreen.jProgressBar1.setValue(0);
        loadingScreen.jProgressBar1.setStringPainted(true);
        try{
            for(int i=0; i<=100; i++){
                loadingScreen.jProgressBar1.setValue(i++);
                boolean isDoneLoading = loadingScreen.jProgressBar1.getValue() == 100;
                Thread.sleep(100);
                if(isDoneLoading){
                    loadingScreen.dispose();
                    BillingInterface billingInterface = new BillingInterface();
                    billingInterface.setVisible(true);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        loadTheScreen();
    }
    
}
