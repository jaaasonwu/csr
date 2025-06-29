package com.blockchain.csr.model.entity;

import lombok.Data;

import jakarta.persistence.*;

/**
 * @author zhangrucheng on 2025/5/19
 */
@Entity
@Data
@Table(name = "activity")
public class Activity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "template_id")
    private Integer templateId;

    @Column(name = "total_time")
    private Integer totalTime;

    @Column(name = "icon", length = 45)
    private String icon;

    @Column(name = "description", length = 1000)
    private String description;

    // JPA relationships (optional - can be added later if needed)
    // @ManyToOne
    // @JoinColumn(name = "event_id", insertable = false, updatable = false)
    // private Event event;

    // @ManyToOne
    // @JoinColumn(name = "template_id", insertable = false, updatable = false)
    // private Template template;
}