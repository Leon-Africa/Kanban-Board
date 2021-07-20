package za.co.bmw.kanban.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KanbanDTO {

    @ApiModelProperty(position = 1)
    private String title;

    @ApiModelProperty(position = 2)
    private LocalDate kanbanDate;
}
