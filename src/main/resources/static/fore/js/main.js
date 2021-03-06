(function ($) {

    $('body').addClass('loaded');

    var toTop = ($('#sidebar').height() - $(window).height()) + 60;
    // Caption
    $('.article-entry').each(function (i) {
        $(this).find('img').each(function () {
            if (this.alt) {
                $(this).after('<span class="caption">' + this.alt + '</span>');
            }

            // 对于已经包含在链接内的图片不适用lightGallery
            if ($(this).parent().prop("tagName") !== 'A') {
                $(this).wrap('<a href="' + this.src + '" title="' + this.alt + '" class="gallery-item"></a>');
            }
        });
    });
    if (lightGallery) {
        var options = {
            selector: '.gallery-item'
        };
        $('.article-entry').each(function (i, entry) {
            lightGallery(entry, options);
        });
        lightGallery($('.article-gallery')[0], options);
    }
    if (!!$.prototype.justifiedGallery) {  // if justifiedGallery method is defined
        $('.justified-gallery').justifiedGallery({
            rowHeight: 140,
            margins: 4,
            lastRow: 'justify'
        });
    }

    // Profile card
    $(document).on('click', function () {
        $('#profile').removeClass('card');
    }).on('click', '#profile-anchor', function (e) {
        e.stopPropagation();
        $('#profile').toggleClass('card');
    }).on('click', '.profile-inner', function (e) {
        e.stopPropagation();
    });

    // To Top
    if ($('#sidebar').length) {
        $(document).on('scroll', function () {
            if (($(this).scrollTop() > toTop) && ($(this).scrollTop() > 0)) {
                $('#toTop').fadeIn().css('right', 10);
            } else {
                $('#toTop').fadeOut();
            }
        }).on('click', '#toTop', function () {
            $('body, html').animate({scrollTop: 0}, 600);
        });
    }

})(jQuery);


$("#avatar").on('click', function () {
    window.location.href = "/";
});


