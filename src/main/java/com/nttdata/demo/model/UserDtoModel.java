package com.nttdata.demo.model;

import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class UserDtoModel {

    private Long idUsrDro;
    private String TxtNombre;
    private String TxtPass;
    private String TxtApePat;
    private String TxtApeMat;
    private String TxtTel;
    private String TxtCorreo;

}
