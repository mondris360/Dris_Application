package com.mondris.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name="employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee{

    @Id
    private String email;

    @Column(name="first_name")
    @NotBlank(message = "firstName is mandatory")
    private String firstName;

    @Column(name="last_name")
    @NotBlank(message = "lastName is mandatory")
    private String lastName;

    @JoinColumn(name = "employment_details")
    @OneToOne(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private EmploymentDetails employmentDetails;

    @Column(name = "phone_contact")
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<PhoneContact> phoneContact;

    @OneToMany(mappedBy = "employeeId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(name="employee_appraisals")
    @JsonIgnore
    private Set<EmployeeAppraisal> employeeAppraisals;

    @OneToMany(mappedBy= "employee", fetch =  FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<OfficialLeave> officialLeaves;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    private Set<Address> address;

    @OneToMany(mappedBy = "createdByUser", fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JsonIgnore
    private Set<SubDepartment> subDepartmentsCreated;


    @OneToMany(mappedBy = "updatedByUser", fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JsonIgnore
    private Set<SubDepartment> subDepartmentsUpdated;

}
