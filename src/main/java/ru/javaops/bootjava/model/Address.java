package ru.javaops.bootjava.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "address")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
	@Id
	//@GeneratedValue(generator = "system-uuid")
	//@GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;




	@Column(name = "country")
	private String country;
	
	@Column(name = "created_at", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_at", insertable = false)
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	@Override
	public String toString() {
		return "Address{" +
				"country='" + country + '\'' +
				'}';
	}

	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserDetails userDetails;



}