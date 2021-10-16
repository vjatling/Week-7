package EventManagementSystem;

public class Event {

    private String eventTitle;
    private String eventDescription;
    private String startDate;
    private String endDate;
    private double eventCost;
    private String venue;
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
}
