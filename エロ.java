@charset "UTF-8";
@charset "iso-8859-15"; 

$(function(){
    $(".slideshow-slide li").css({"position":"relative"});
    $(".slideshow-slide li").hide().css({"position":"absolute"});
    $(".slideshow-slide li:first").addClass("slide");
    $(".slideshow-slide li:nth-child(2)").css({"display":"block"});
    setInterval(function(){
      var $active = $(".slideshow-slide li.slide");
      var $next = $active.next("li").length?$active.next("li"):$(".slideshow-slide li:first");
      var $nextnext = $next.next("li");
      $active.fadeOut(0).removeClass("slide");
      $next.show().addClass("slide");
      $nextnext.css({"display":"block"});
    },3000);
  });