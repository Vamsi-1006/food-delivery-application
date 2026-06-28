package com.vamsi.food_delivery.controller;

import com.vamsi.food_delivery.io.CartRequest;
import com.vamsi.food_delivery.io.CartResponse;
import com.vamsi.food_delivery.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;
    @PostMapping
    public CartResponse addToCart(@RequestBody CartRequest request){
        String foodId=request.getFoodId();
        if(foodId==null || foodId.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"foodId not found!!");
        }
        return cartService.addToCart(request);
    }

    @GetMapping
    public CartResponse getCart(){
        return cartService.getCart();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void clearCart(){
        cartService.clearCart();
    }

    @PostMapping("/remove")
    public CartResponse removeFromCart(@RequestBody CartRequest request){
        String foodId=request.getFoodId();
        if(foodId==null || foodId.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"foodId not found!!");
        }
        return cartService.removeFromCart(request);
    }
}
