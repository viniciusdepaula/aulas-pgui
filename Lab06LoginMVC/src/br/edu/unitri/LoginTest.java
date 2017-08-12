package br.edu.unitri;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author viniciusdepaula
 */
public class LoginTest {
    
    public static void main(String[] args) {
        
        LoginView view = new LoginView();
        LoginModel model = new LoginModel();
        
        LoginController controller = new LoginController(view, model);
        
        view.setVisible(true);
    }
}
