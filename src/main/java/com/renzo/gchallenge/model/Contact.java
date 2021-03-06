package com.renzo.gchallenge.model;

import java.time.LocalDate;

public class Contact {

    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dob;

    public Contact(String firstName, String lastName, Gender gender, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Autogenerated hashCode() & equals()

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;

        result = (prime * result) + ((this.dob == null) ? 0 : this.dob.hashCode());
        result = (prime * result) + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = (prime * result) + ((this.gender == null) ? 0 : this.gender.hashCode());
        result = (prime * result) + ((this.lastName == null) ? 0 : this.lastName.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Contact other = (Contact) obj;
        if (this.dob == null) {
            if (other.dob != null) {
                return false;
            }
        }
        else if (!this.dob.equals(other.dob)) {
            return false;
        }
        if (this.firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        }
        else if (!this.firstName.equals(other.firstName)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        if (this.lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        }
        else if (!this.lastName.equals(other.lastName)) {
            return false;
        }
        return true;
    }
}
