package com.creativefusion.suruthiga.service;

import java.util.List;

import com.creativefusion.suruthiga.dto.request.MenuRequest;
import com.creativefusion.suruthiga.dto.response.CountResponse;
import com.creativefusion.suruthiga.dto.response.MenuResponse;
import com.creativefusion.suruthiga.model.Menu;

public interface MenuService {

    boolean saveMenu(MenuRequest request);

    List<MenuResponse> getAllMenu();

    MenuResponse getMenu(Long mid);

    MenuResponse updateMenu(MenuRequest request, Long mid);

    boolean deleteMenu(Long mid);

    Menu getMenuModelId(Long mid);

    CountResponse productCount();

}
