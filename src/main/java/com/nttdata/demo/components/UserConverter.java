package com.nttdata.demo.components;

import com.nttdata.demo.entity.UsrDro;
import com.nttdata.demo.model.UserDtoModel;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserConverter {

    BCryptPasswordEncoder cryp = new BCryptPasswordEncoder();
    public UsrDro ModelToUser(UserDtoModel model){
        UsrDro user = new UsrDro();
        user.setTxtNombre(model.getTxtNombre());
        user.setTxtApePat(model.getTxtApePat());
        user.setTxtApeMat(model.getTxtApeMat());
        user.setTxtPass(cryp.encode(model.getTxtPass()));
        user.setTxtCorreo(model.getTxtCorreo());
        user.setTxtTel(model.getTxtTel());
        user.setFechaCarga(new Date());
        user.setFechaUltCon(new Date());
        return user;
    }
}
