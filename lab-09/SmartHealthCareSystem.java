package Lab09;

abstract class Patient {
    abstract void getTreatment();
}

interface InsuranceService {
    void serviceStatus();
}

interface EmergencyService {
    void serviceStatus();
}

class CriticalPatient extends Patient implements InsuranceService, EmergencyService {

    public void getTreatment() {
        System.out.println("Critical patient receiving intensive care.");
    }

    public void insuranceStatus() {
        System.out.println("Insurance: Coverage approved.");
    }

    public void emergencyStatus() {
        System.out.println("Emergency: Immediate response activated.");
    }

    public void serviceStatus() {
        insuranceStatus();
        emergencyStatus();
    }

    class MedicalHistory {
        void showHistory() {
            System.out.println("Medical history displayed.");
        }
    }

    public static void main(String[] args) {
        CriticalPatient p = new CriticalPatient();

        p.getTreatment();
        p.serviceStatus();

        CriticalPatient.MedicalHistory mh = p.new MedicalHistory();
        mh.showHistory();
    }
}
