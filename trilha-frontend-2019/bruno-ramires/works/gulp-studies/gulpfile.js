// gulp
const gulp = require('gulp');

// call the plugin
const minifyCSS = require('gulp-minify-css');
const concat = require('gulp-concat');
const autoPrefixer = require('gulp-autoprefixer');

gulp.task('reduzir-imagem', () => {
});

gulp.task('styles', () => {
  let diretoriosCSS = [
    'src/vendor/fontawesome-free/css/fontawesome.css',
    'src/vendor/magnific-popup/magnific-popup.css',
    'src/css/creative.css'
  ];

  let diretorioBuild = 'build/css';

  gulp.src(diretoriosCSS)
    .pipe(concat('main.css'))
    .pipe(autoPrefixer('last 1 version'))
    .pipe(minifyCSS())
    .pipe(gulp.dest(diretorioBuild));
});

gulp.task('font-awesome', () => {
  gulp.src('src/vendor/fontawesome-free/webfonts/*')
    .pipe(gulp.dest('build/fonts'));
});


// *******default need to configure *******
gulp.task('default', ['reduzir-imagem', 'styles', 'font-awesome'], function() {

});