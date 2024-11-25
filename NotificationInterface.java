// notification intreface

public interface NotificationInterface {
  String getNotificationId();   
  void send();        
  // Get the notification message               
  String getMessage();     
  // Get the user who will receive the notification           
  User getTargetUser();    
  boolean isRead();
  void markAsRead();
          
}
