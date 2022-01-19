(function(window) {
    "use-strict";

    document.addEventListener("DOMContentLoaded",function()){
        $(".owl-carousel").owlCarousel({
            loop:true,
            responsiveClass: true,
            autoplay: false,
            dots: false,
            nav: true,
            responsive : {
                0: {
                    item: 1
                }
            }
        })
    }
})();