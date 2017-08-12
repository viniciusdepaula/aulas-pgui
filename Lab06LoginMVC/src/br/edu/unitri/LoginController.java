package br.edu.unitri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author viniciusdepaula
 */
public class LoginController {

    private LoginView view;
    private LoginModel model;

    public LoginController(LoginView view, LoginModel model) {
        
        this.view = view;
        this.model = model;
        this.view.addLoginListener(new LoginListener());
    }
    
    public boolean validarLogin(LoginModel model) throws Exception {

            String dbUrl = "jdbc:derby://localhost:1527/db_test;user=user_test;password=123mudar";
            String dbClass = "org.apache.derby.jdbc.ClientDriver";
            String query = "SELECT * FROM tbl_usuario WHERE ds_login = ? AND ds_senha = ?";

            try {
                Class.forName(dbClass);
                Connection con = DriverManager.getConnection(dbUrl);
                PreparedStatement prepStmt = con.prepareStatement(query);
                prepStmt.setString(1, model.getUsuario());
                prepStmt.setString(2, model.getSenha());
                ResultSet rs = prepStmt.executeQuery();

                if (rs.next()) {
                    return true;
                }
                con.close();
            } catch (Exception e) {
                throw e;
            }
            return false;
        }
    
        class LoginListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    model = new LoginModel(view.getTxtUsuario(), view.getTxtSenha());

                    if(validarLogin(model)){
                        view.exibirMensagem("Login realizado com sucesso!");
                    }else{
                        view.exibirMensagem("Usuário e/ou senha inválidos!");
                    }                
                } catch (Exception ex) {

                    view.exibirMensagem(ex.toString());
                }

            }
        }
}

