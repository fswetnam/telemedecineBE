package com.telemedecineBE.entities;

import com.telemedecineBE.enumeration.MessageType;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	@Column(name="CONTENT")
	private String content;
	@Column(name="DATE")
	private LocalDate date;
	@Column(name="SENDER_ID")
	private Integer sender_id;
	@Column(name="RECEIVER_ID")
	private Integer receiver_id;
	@Column(name="MESSAGE_TYPE")
	private MessageType messageType;

	public Message(String content, LocalDate date){
		super();
		this.content = content;
		this.date = date;
	}

	public Message(String content){
		super();
		this.content = content;
		this.date = LocalDate.now();
	}

	public Message(String content, MessageType messageType){
		super();
		this.content = content;
		this.messageType = messageType;
		this.date = LocalDate.now();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}