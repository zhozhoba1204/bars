package com.blinov.bars.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contract")
public class ContractEntity {

    @Id
    private Long number;

    @Column(name = "date_of_creation", nullable = false)
    private LocalDate dateOfCreation;

    @Column(name = "last_update")
    private LocalDate lastUpdate;

    @Column(name = "check_box")
    private boolean checkBox;
}
