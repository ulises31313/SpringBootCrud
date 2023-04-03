package com.nttdata.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.NotNull;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "LIQ_MX_MAE_USR_DRO")
public class UsrDro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USR_PK")
    private Long idUsrDro;

    @Column(name = "TXT_NOMBRE",length=50)
    private String TxtNombre;

    @Column(name = "TXT_PASS",length=50)
    private String TxtPass;

    @Column(name = "TXT_APE_PAT",length=50)
    private String TxtApePat;

    @Column(name = "TXT_APE_MAT",length=50)
    private String TxtApeMat;


    @Column(name = "TXT_TEL",length=50)
    private String TxtTel;

    @CreatedDate
    @Column(name = "FCH_ULT_CON")
    private Date FechaUltCon;

    @CreatedDate
    @Column(name = "FCH_CARGA")
    private Date FechaCarga;

    @Column(name = "TXT_CORREO",length=50)
    private String TxtCorreo;

}
