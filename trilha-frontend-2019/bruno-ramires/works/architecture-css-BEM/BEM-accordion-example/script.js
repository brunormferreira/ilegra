var $title = $('.js-title');
var copy   = '.js-copy';

$title.click(function () {
  $(this).next(copy).slideToggle();
  $(this).parent().siblings().children().next().slideUp();
  return false;
});