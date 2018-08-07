package com.example.marius.sportivebets.utils;

import com.example.marius.sportivebets.R;
import com.example.marius.sportivebets.home.MenuItem;
import com.example.marius.sportivebets.home.MenuItemsModel;

import java.util.Arrays;
import java.util.List;

public class Constants {

    private static final MenuItem footballItem = new MenuItem("Football", R.drawable.soccer);
    private static final MenuItem tenisItem = new MenuItem("Tenis", R.drawable.tennisball);
    private static final MenuItem pingPongItem = new MenuItem("PingPong", R.drawable.pingpong);
    private static final MenuItem basketBallItem = new MenuItem("Basketball", R.drawable.basketball);
    private static final MenuItem cricketItem = new MenuItem("Cricket", R.drawable.cricket);
    private static final MenuItem badmintonItem = new MenuItem("Badminton", R.drawable.badminton);
    private static final MenuItem rugbyItem = new MenuItem("Rugby", R.drawable.americanfootball);
    private static final MenuItem bowlingItem = new MenuItem("Bowling", R.drawable.bowling);
    private static final MenuItem chessItem = new MenuItem("Chess", R.drawable.chess);
    private static final MenuItem golfItem = new MenuItem("Golf", R.drawable.golf);
    private static final MenuItem hockeyItem = new MenuItem("Hockey", R.drawable.hockey);
    private static final MenuItem boxItem = new MenuItem("Box", R.drawable.boxing);
    private static final MenuItem volleyballItem = new MenuItem("Volleyball", R.drawable.volleyball);


    public static final List<MenuItemsModel> menuItems = Arrays.asList(new MenuItemsModel(footballItem),
            new MenuItemsModel(tenisItem),new MenuItemsModel(pingPongItem),new MenuItemsModel(basketBallItem),
            new MenuItemsModel(cricketItem),new MenuItemsModel(badmintonItem),new MenuItemsModel(rugbyItem),
            new MenuItemsModel(bowlingItem),new MenuItemsModel(chessItem),new MenuItemsModel(golfItem),
            new MenuItemsModel(hockeyItem),new MenuItemsModel(boxItem),new MenuItemsModel(volleyballItem));


}
