package com.innter.msdesigncatalog.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DesignUnitMeasureResponse {

    @JsonProperty("unitMeasureId")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("abbreviation")
    private String abbreviation;

}
