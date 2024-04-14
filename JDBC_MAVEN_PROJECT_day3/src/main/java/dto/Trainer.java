package dto;

public class Trainer {

	private int TrainerId;
	private String TrainerName;
	private String TrainerSkill;
	private String TrainerAddress;
	private double TrainerSalary;
	private long TrainerPhone;
	public int getTrainerId() {
		return TrainerId;
	}
	public void setTrainerId(int trainerId) {
		TrainerId = trainerId;
	}
	public String getTrainerName() {
		return TrainerName;
	}
	public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}
	public String getTrainerSkill() {
		return TrainerSkill;
	}
	public void setTrainerSkill(String trainerSkill) {
		TrainerSkill = trainerSkill;
	}
	public String getTrainerAddress() {
		return TrainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		TrainerAddress = trainerAddress;
	}
	public double getTrainerSalary() {
		return TrainerSalary;
	}
	public void setTrainerSalary(double trainerSalary) {
		TrainerSalary = trainerSalary;
	}
	public long getTrainerPhone() {
		return TrainerPhone;
	}
	public void setTrainerPhone(long trainerPhone) {
		TrainerPhone = trainerPhone;
	}
	@Override
	public String toString() {
		return "Trainer [TrainerId=" + TrainerId + ", TrainerName=" + TrainerName + ", TrainerSkill=" + TrainerSkill
				+ ", TrainerAddress=" + TrainerAddress + ", TrainerSalary=" + TrainerSalary + ", TrainerPhone="
				+ TrainerPhone + "]";
	}

}
