package com.innter.msdesigncatalog.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_design_colors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DesignColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fi_id")
    private Long id;

    @Column(name = "fc_name")
    private String name;

    @Column(name = "fc_color")
    private String color;

    @Column(name = "fc_provider")
    private String provider;

    @Column(name = "fb_status")
    private Boolean status = true;

}
