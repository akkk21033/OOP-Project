package HMS;

import java.util.Date;

public class Appointment {
	private int appointmentID;
	private int patientID;
	private int doctorID;
	private Date appointmentDate;
	private AppointmentStatus appointmentStatus;

	public Appointment(int appointmentID, int patientID, int doctorID, Date appointmentDate,
			AppointmentStatus appointmentStatus) {
		this.appointmentID = appointmentID;
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.appointmentDate = appointmentDate;
		this.appointmentStatus = appointmentStatus;
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public void confirmAppointment() {
		this.appointmentStatus = AppointmentStatus.CONFIRMED;
		System.out.println("Appointment confirmed.");
	}

	public void cancelAppointment() {
		this.appointmentStatus = AppointmentStatus.CANCELLED;
		System.out.println("Appointment cancelled.");
	}

	public void rescheduleAppointment(Date newDate) {
		if (this.appointmentStatus != AppointmentStatus.CANCELLED) {
			this.appointmentDate = newDate;
			this.appointmentStatus = AppointmentStatus.CONFIRMED;
			System.out.println("Appointment rescheduled to: " + newDate);
		} else {
			System.out.println("Cannot reschedule a cancelled appointment.");
		}
	}

	@Override
	public String toString() {
		return "Appointment [appointmentID=" + appointmentID + ", patientID=" + patientID + ", doctorID=" + doctorID
				+ ", appointmentDate=" + appointmentDate + ", appointmentStatus=" + appointmentStatus + "]";
	}

}
