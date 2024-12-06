package Library;

public abstract class User {
    String userId;
    private String name;
    private String contactInfo;
    public User() {
        this.userId = this.generateUniqueID();
    }
    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User user) {
        this.userId = user.userId;
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getContactInfo(){
        return contactInfo;
    }
    void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }
    String generateUniqueID(){
        return "0";
    }
    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
}
