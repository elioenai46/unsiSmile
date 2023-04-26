$(document).ready(function () {
            $(".btn-next").click(function () {
                var activeTab = $(".tab-pane.active");
                var nextTab = activeTab.next(".tab-pane");
                if (nextTab.length > 0) {
                    activeTab.removeClass("active");
                    nextTab.addClass("active");
                    $('a[href="#' + nextTab.attr("id") + '"]').tab("show");
                }
            });
            $(".btn-back").click(function () {
                var activeTab = $(".tab-pane.active");
                var prevTab = activeTab.prev(".tab-pane");
                if (prevTab.length > 0) {
                    activeTab.removeClass("active");
                    prevTab.addClass("active");
                    $('a[href="#' + prevTab.attr("id") + '"]').tab("show");
                }
            });
        });