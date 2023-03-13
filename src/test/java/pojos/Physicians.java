package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Physicians {

        private String createdBy;
        private String createdDate;
        private int id;
        private String firstName;
        private String lastName;
        private String birthDate;
        private String phone;
        private String gender;
        private String bloodGroup;
        private String adress;
        private String description;
        private UserPojo user;
        private String speciality;

        public Physicians() {
        }

        public Physicians(String createdBy, String createdDate, int id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String description, UserPojo user, String speciality) {
                this.createdBy = createdBy;
                this.createdDate = createdDate;
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.birthDate = birthDate;
                this.phone = phone;
                this.gender = gender;
                this.bloodGroup = bloodGroup;
                this.adress = adress;
                this.description = description;
                this.user = user;
                this.speciality = speciality;
        }

        public String getCreatedBy() {
                return createdBy;
        }

        public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
        }

        public String getCreatedDate() {
                return createdDate;
        }

        public void setCreatedDate(String createdDate) {
                this.createdDate = createdDate;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(String birthDate) {
                this.birthDate = birthDate;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getBloodGroup() {
                return bloodGroup;
        }

        public void setBloodGroup(String bloodGroup) {
                this.bloodGroup = bloodGroup;
        }

        public String getAdress() {
                return adress;
        }

        public void setAdress(String adress) {
                this.adress = adress;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public UserPojo getUser() {
                return user;
        }

        public void setUser(UserPojo user) {
                this.user = user;
        }

        public String getSpeciality() {
                return speciality;
        }

        public void setSpeciality(String speciality) {
                this.speciality = speciality;
        }

        @Override
        public String toString() {
                return "Physicians{" +
                        "createdBy='" + createdBy + '\'' +
                        ", createdDate='" + createdDate + '\'' +
                        ", id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", birthDate='" + birthDate + '\'' +
                        ", phone='" + phone + '\'' +
                        ", gender='" + gender + '\'' +
                        ", bloodGroup='" + bloodGroup + '\'' +
                        ", adress='" + adress + '\'' +
                        ", description='" + description + '\'' +
                        ", user=" + user +
                        ", speciality='" + speciality + '\'' +
                        '}';
        }
}
/*
{
        "createdBy": "adminteam04",
        "createdDate": "2023-02-19T01:09:46.888203Z",
        "id": 1304,
        "firstName": "dat",
        "lastName": "Babadagi",
        "birthDate": "1987-06-19T04:00:00Z",
        "phone": "4372254567",
        "gender": "MALE",
        "bloodGroup": "Apositive",
        "adress": "28 Harrison Grd",
        "description": "",
        "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2023-02-18T23:51:51.026053Z",
            "id": 1147,
            "login": "doktorsedat",
            "firstName": "dat",
            "lastName": "Babadagi",
            "email": "doctorsedat@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "796-09-0909"
        },
        "speciality": "INTERNAL_MEDICINE",
        "appointments": null,
        "country": null,
        "cstate": null,
        "examFee": 250.00,
        "image": "",
        "imageContentType": null
    }
 */