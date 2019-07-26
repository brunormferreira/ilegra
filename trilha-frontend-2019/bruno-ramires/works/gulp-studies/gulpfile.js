// gulp
const gulp = require('gulp');

// call the plugin
const imagemin = require('gulp-imagemin');

gulp.task('reduzir-imagem', () => {

  let diretorioProjeto = "src/imagens/*";
  let diretorioBuild = "build/imagens";

  gulp.src(diretorioProjeto)
    .pipe(imagemin())
    .pipe(gulp.dest(diretorioBuild))
});