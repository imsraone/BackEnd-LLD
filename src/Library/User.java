package Library;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private int totalUsers;
    public User() {
        this.userId = this.generateUniqueId();
        totalUsers += 1;
    }
    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User user) {
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }
    public int getTotalUsers() {
        return totalUsers;
    }
    String getUserId() {
        return userId;
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
    private final String generateUniqueId(){
        return String.valueOf(totalUsers);
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
