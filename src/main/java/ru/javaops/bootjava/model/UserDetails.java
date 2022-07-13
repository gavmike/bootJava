package ru.javaops.bootjava.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user_details")
@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {


	//@GeneratedValue(generator = "system-uuid")
	//@GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "created_at", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_at", insertable = false)
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH},orphanRemoval = false, mappedBy = "userDetails", fetch = FetchType.EAGER)
	private List<Address> addresses;

	@Override
	public String toString() {
		return "UserDetails{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", mobileNumber='" + mobileNumber + '\'' +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				", addresses=" + addresses +
				'}';
	}
}