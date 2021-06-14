/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.EventListener;

/**
 *
 * @author angel_p11
 */
public interface StateListener extends EventListener {

    void stateChanged(Cell cell);
}
