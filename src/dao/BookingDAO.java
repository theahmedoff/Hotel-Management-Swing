/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Booking;

/**
 *
 * @author Ahme_vn75
 */
public interface BookingDAO {
     List<Booking> getAllBoking();
     boolean createBooking(Booking b);
}
