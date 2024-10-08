package lan.pass.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pass {
    private Long id;
    private String name;
    private Long ownerId;
    private Boolean isActive;
    private LocalDateTime lastModified;
    private LocalDateTime createdDate;
    private Boolean isTemplate;
    private Long assetId;
}