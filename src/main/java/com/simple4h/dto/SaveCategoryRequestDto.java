package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class SaveCategoryRequestDto implements Serializable {

    private SaveCategoryInputDto category = null;


    /**
     *
     **/
    public SaveCategoryRequestDto category(SaveCategoryInputDto category) {
        this.category = category;
        return this;
    }


    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("category")
    public SaveCategoryInputDto getCategory() {
        return category;
    }

    public void setCategory(SaveCategoryInputDto category) {
        this.category = category;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SaveCategoryRequestDto saveCategoryRequest = (SaveCategoryRequestDto) o;
        return Objects.equals(category, saveCategoryRequest.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveCategoryRequestDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

