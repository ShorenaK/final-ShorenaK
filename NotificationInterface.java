// notification intreface

public interface NotificationInterface {
  void send();        
  // Get the notification message               
  String getMessage();     
  // Get the user who will receive the notification           
  User getTargetUser();               
}
