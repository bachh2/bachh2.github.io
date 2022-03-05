let imageArray = [
  "https://64.media.tumblr.com/2a4d7bc00635901b143f8960b76a4157/97cd15c372b0bfd1-43/s640x960/62803815dbda778d14688446943b4a3958aa808f.png",
  "https://64.media.tumblr.com/a7b25543c663e5c1fb275d7b4ffb654d/9428a8ebcd141a7a-d7/s640x960/8dedbdadb8a05d85fce38d259b8d43c0e9934888.png",
  "https://storage.googleapis.com/ygoprodeck.com/pics_artgame/60037599.jpg",
  "https://storage.googleapis.com/ygoprodeck.com/pics_artgame/22420202.jpg",
  "https://64.media.tumblr.com/441cfb9b6fd570a5c6ad146f68384f29/c3246f2fec46d1f8-cd/s540x810/cdf330adfb8e6f3bc07cc6d5ddd4ce1200d88bbf.png",
  "https://i.pinimg.com/originals/08/fb/0b/08fb0bb31ca21e4c581a3e729d8d37d5.jpg",
];

$("#thumbImage").on("click", function () {
  let source = $(this).attr("src");
  $("#mainImage").attr("src", source);
});

function prev() {
  for (let i = 0; i < imageArray.length; i++) {
    if ($("#mainImage").attr("src") === imageArray[i]) {
      if (i != 0) {
        $("#mainImage").attr("src", imageArray[i - 1]);
      } else {
        $("#mainImage").attr("src", imageArray[imageArray.length - 1]);
      }
    }
  }
}

function next() {  
  for (let i = 0; i < imageArray.length; i++) {
    if ($("#mainImage").attr("src") === imageArray[i]) {
      if (i != imageArray.length - 1) {
        $("#mainImage").attr("src", imageArray[i + 1]);
      } else {
        $("#mainImage").attr("src", imageArray[0]);
      }
    }
  }
}
