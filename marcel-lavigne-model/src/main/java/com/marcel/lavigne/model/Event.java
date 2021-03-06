package com.marcel.lavigne.model;

import com.marcel.lavigne.model.enumeration.EventType;

import com.vividsolutions.jts.geom.Point;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "event")
public class Event extends MarcelLavigneEntity {

	private String name;

	private String content;

    @Enumerated(EnumType.STRING)
	private EventType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
	private User owner;

	private String address;

	private String city;

	private String country;

	private Integer capacity;

	private Point location;

	private String phone;

	private Double price;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
	private List<Comment> comments;

	@Column(name = "auto_accept_subscription")
	private boolean autoAcceptSubscsription;

	private LocalDateTime date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public boolean isAutoAcceptSubscsription() {
        return autoAcceptSubscsription;
    }

    public void setAutoAcceptSubscsription(boolean autoAcceptSubscsription) {
        this.autoAcceptSubscsription = autoAcceptSubscsription;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
