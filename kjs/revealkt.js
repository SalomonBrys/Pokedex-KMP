(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'kotlin', 'kotlinx-html-js'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('kotlin'), require('kotlinx-html-js'));
  else {
    if (typeof kotlin === 'undefined') {
      throw new Error("Error loading module 'revealkt'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'revealkt'.");
    }
    if (typeof this['kotlinx-html-js'] === 'undefined') {
      throw new Error("Error loading module 'revealkt'. Its dependency 'kotlinx-html-js' was not found. Please, check whether 'kotlinx-html-js' is loaded prior to 'revealkt'.");
    }
    root.revealkt = factory(typeof revealkt === 'undefined' ? {} : revealkt, kotlin, this['kotlinx-html-js']);
  }
}(this, function (_, Kotlin, $module$kotlinx_html_js) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var div = $module$kotlinx_html_js.kotlinx.html.div_ri36nr$;
  var div_0 = $module$kotlinx_html_js.kotlinx.html.js.div_wkomt5$;
  var set_id = $module$kotlinx_html_js.kotlinx.html.set_id_ueiko3$;
  var section = $module$kotlinx_html_js.kotlinx.html.section_ezs79p$;
  var aside = $module$kotlinx_html_js.kotlinx.html.aside_3uzs4w$;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var RegexOption = Kotlin.kotlin.text.RegexOption;
  var Regex_init = Kotlin.kotlin.text.Regex_init_sb3q2$;
  var IllegalStateException_init = Kotlin.kotlin.IllegalStateException_init_pdl1vj$;
  var StringBuilder = Kotlin.kotlin.text.StringBuilder;
  var appendHTML = $module$kotlinx_html_js.kotlinx.html.stream.appendHTML_9kwp7w$;
  var unsafe = $module$kotlinx_html_js.kotlinx.html.unsafe_vdrn79$;
  var span = $module$kotlinx_html_js.kotlinx.html.span_fqsp1s$;
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  var onFinalize = $module$kotlinx_html_js.kotlinx.html.consumers.onFinalize_fnbzu2$;
  var code = $module$kotlinx_html_js.kotlinx.html.code_c7b9vx$;
  var pre = $module$kotlinx_html_js.kotlinx.html.pre_1138nj$;
  var Regex_init_0 = Kotlin.kotlin.text.Regex_init_61zpoe$;
  var img = $module$kotlinx_html_js.kotlinx.html.img_45d5o1$;
  function createConfig(conf) {
    var obj = {};
    conf(obj);
    return obj;
  }
  function revealDependency(conf) {
    return createConfig(conf);
  }
  function multiplexConfig(conf) {
    return createConfig(conf);
  }
  function mathConfig(conf) {
    return createConfig(conf);
  }
  function Reveal_0() {
    Reveal_instance = this;
  }
  Reveal_0.prototype.initialize_3oypv5$ = function (conf) {
    Reveal.initialize(createConfig(conf));
  };
  Reveal_0.prototype.configure_3oypv5$ = function (diff) {
    Reveal.configure(createConfig(diff));
  };
  Reveal_0.prototype.sync = function () {
    Reveal.sync();
  };
  Reveal_0.prototype.slide_bpg8ou$ = function (indexh, indexv, indexf) {
    if (indexv === void 0)
      indexv = null;
    if (indexf === void 0)
      indexf = null;
    Reveal.slide(indexh, indexv, indexf);
  };
  Reveal_0.prototype.left = function () {
    Reveal.left();
  };
  Reveal_0.prototype.right = function () {
    Reveal.right();
  };
  Reveal_0.prototype.up = function () {
    Reveal.up();
  };
  Reveal_0.prototype.down = function () {
    Reveal.down();
  };
  Reveal_0.prototype.prev = function () {
    Reveal.prev();
  };
  Reveal_0.prototype.next = function () {
    Reveal.next();
  };
  Reveal_0.prototype.navigateFragment_2c627j$ = function (index, offset) {
    if (index === void 0)
      index = null;
    Reveal.navigateFragment(index, offset);
  };
  Reveal_0.prototype.prevFragment = function () {
    return Reveal.prevFragment();
  };
  Reveal_0.prototype.nextFragment = function () {
    return Reveal.nextFragment();
  };
  Reveal_0.prototype.layout = function () {
    Reveal.layout();
  };
  Reveal_0.prototype.shuffle = function () {
    Reveal.shuffle();
  };
  Reveal_0.prototype.availableRoutes = function () {
    return Reveal.availableRoutes();
  };
  Reveal_0.prototype.availableFragments = function () {
    return Reveal.availableFragments();
  };
  Reveal_0.prototype.toggleHelp_1v8dbw$ = function (override) {
    if (override === void 0)
      override = null;
    Reveal.toggleHelp(override);
  };
  Reveal_0.prototype.toggleOverview_1v8dbw$ = function (override) {
    if (override === void 0)
      override = null;
    Reveal.toggleOverview(override);
  };
  Reveal_0.prototype.togglePause_1v8dbw$ = function (override) {
    if (override === void 0)
      override = null;
    Reveal.togglePause(override);
  };
  Reveal_0.prototype.toggleAutoSlide_1v8dbw$ = function (override) {
    if (override === void 0)
      override = null;
    Reveal.toggleAutoSlide(override);
  };
  Reveal_0.prototype.isOverview = function () {
    return Reveal.isOverview();
  };
  Reveal_0.prototype.isPaused = function () {
    return Reveal.isPaused();
  };
  Reveal_0.prototype.isAutoSliding = function () {
    return Reveal.isAutoSliding();
  };
  Reveal_0.prototype.isSpeakerNotes = function () {
    return Reveal.isSpeakerNotes();
  };
  Reveal_0.prototype.setState_za3rmp$ = function (state) {
    Reveal.setState(state);
  };
  Reveal_0.prototype.getState = function () {
    return Reveal.getState();
  };
  Reveal_0.prototype.getSlidePastCount = function () {
    return Reveal.getSlidePastCount();
  };
  Reveal_0.prototype.getProgress = function () {
    return Reveal.getProgress();
  };
  Reveal_0.prototype.getIndices_ejp6n4$ = function (slide) {
    if (slide === void 0)
      slide = null;
    return Reveal.getIndices(slide);
  };
  Reveal_0.prototype.getSlides = function () {
    return Reveal.getSlides();
  };
  Reveal_0.prototype.getTotalSlides = function () {
    return Reveal.getTotalSlides();
  };
  Reveal_0.prototype.getSlide_6sxnot$ = function (x, y) {
    if (y === void 0)
      y = null;
    return Reveal.getSlide(x, y);
  };
  Reveal_0.prototype.getSlideNotes_ejp6n4$ = function (slide) {
    if (slide === void 0)
      slide = null;
    return Reveal.getSlideNotes(slide);
  };
  Reveal_0.prototype.getPreviousSlide = function () {
    return Reveal.getPreviousSlide();
  };
  Reveal_0.prototype.getCurrentSlide = function () {
    return Reveal.getCurrentSlide();
  };
  Reveal_0.prototype.getScale = function () {
    return Reveal.getScale();
  };
  Reveal_0.prototype.getConfig = function () {
    return Reveal.getConfig();
  };
  Reveal_0.prototype.getQueryHash = function () {
    return Reveal.getQueryHash();
  };
  Reveal_0.prototype.isFirstSlide = function () {
    return Reveal.isFirstSlide();
  };
  Reveal_0.prototype.isLastSlide = function () {
    return Reveal.isLastSlide();
  };
  Reveal_0.prototype.isReady = function () {
    return Reveal.isReady();
  };
  Reveal_0.prototype.addEventListener_3ycp26$ = function (type, useCapture, listener) {
    if (useCapture === void 0)
      useCapture = null;
    Reveal.addEventListener(type, listener, useCapture);
    return listener;
  };
  Reveal_0.prototype.removeEventListener_3ycp26$ = function (type, useCapture, listener) {
    if (useCapture === void 0)
      useCapture = null;
    Reveal.removeEventListener(type, listener, useCapture);
  };
  Reveal_0.prototype.triggerKey_za3lpa$ = function (keyCode) {
    Reveal.triggerKey(keyCode);
  };
  Reveal_0.prototype.registerKeyboardShortcut_puj7f4$ = function (key, value) {
    Reveal.registerKeyboardShortcut(key, value);
  };
  function Reveal$addOnReady$lambda(closure$f) {
    return function (it) {
      closure$f(it);
      return Unit;
    };
  }
  Reveal_0.prototype.addOnReady_ch6qv7$ = function (f) {
    return this.addEventListener_3ycp26$('ready', void 0, Reveal$addOnReady$lambda(f));
  };
  function Reveal$addOnSlideChanged$lambda(closure$f) {
    return function (it) {
      closure$f(it);
      return Unit;
    };
  }
  Reveal_0.prototype.addOnSlideChanged_7t9d3p$ = function (f) {
    return this.addEventListener_3ycp26$('slidechanged', void 0, Reveal$addOnSlideChanged$lambda(f));
  };
  function Reveal$addOnFragmentShown$lambda(closure$f) {
    return function (it) {
      closure$f(it);
      return Unit;
    };
  }
  Reveal_0.prototype.addOnFragmentShown_at4sns$ = function (f) {
    return this.addEventListener_3ycp26$('fragmentshown', void 0, Reveal$addOnFragmentShown$lambda(f));
  };
  function Reveal$addOnFragmentHidden$lambda(closure$f) {
    return function (it) {
      closure$f(it);
      return Unit;
    };
  }
  Reveal_0.prototype.addOnFragmentHidden_at4sns$ = function (f) {
    return this.addEventListener_3ycp26$('fragmenthidden', void 0, Reveal$addOnFragmentHidden$lambda(f));
  };
  function Reveal$addOnOverviewShown$lambda(closure$f) {
    return function (it) {
      closure$f(it);
      return Unit;
    };
  }
  Reveal_0.prototype.addOnOverviewShown_ch6qv7$ = function (f) {
    return this.addEventListener_3ycp26$('overviewshown', void 0, Reveal$addOnOverviewShown$lambda(f));
  };
  function Reveal$addOnOverviewHidden$lambda(closure$f) {
    return function (it) {
      closure$f(it);
      return Unit;
    };
  }
  Reveal_0.prototype.addOnOverviewHidden_ch6qv7$ = function (f) {
    return this.addEventListener_3ycp26$('overviewhidden', void 0, Reveal$addOnOverviewHidden$lambda(f));
  };
  function Reveal$addOnPdfReady$lambda(closure$f) {
    return function (it) {
      closure$f();
      return Unit;
    };
  }
  Reveal_0.prototype.addOnPdfReady_o14v8n$ = function (f) {
    return this.addEventListener_3ycp26$('pdf-ready', void 0, Reveal$addOnPdfReady$lambda(f));
  };
  function Reveal$addOnPaused$lambda(closure$f) {
    return function (it) {
      closure$f();
      return Unit;
    };
  }
  Reveal_0.prototype.addOnPaused_o14v8n$ = function (f) {
    return this.addEventListener_3ycp26$('paused', void 0, Reveal$addOnPaused$lambda(f));
  };
  function Reveal$addOnResumed$lambda(closure$f) {
    return function (it) {
      closure$f();
      return Unit;
    };
  }
  Reveal_0.prototype.addOnResumed_o14v8n$ = function (f) {
    return this.addEventListener_3ycp26$('resumed', void 0, Reveal$addOnResumed$lambda(f));
  };
  function Reveal$addOnAutoSlidePaused$lambda(closure$f) {
    return function (it) {
      closure$f();
      return Unit;
    };
  }
  Reveal_0.prototype.addOnAutoSlidePaused_o14v8n$ = function (f) {
    return this.addEventListener_3ycp26$('autoslidepaused', void 0, Reveal$addOnAutoSlidePaused$lambda(f));
  };
  function Reveal$addOnAutoSlideResumed$lambda(closure$f) {
    return function (it) {
      closure$f();
      return Unit;
    };
  }
  Reveal_0.prototype.addOnAutoSlideResumed_o14v8n$ = function (f) {
    return this.addEventListener_3ycp26$('autoslideresumed', void 0, Reveal$addOnAutoSlideResumed$lambda(f));
  };
  Reveal_0.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Reveal',
    interfaces: []
  };
  var Reveal_instance = null;
  function Reveal_getInstance() {
    if (Reveal_instance === null) {
      new Reveal_0();
    }
    return Reveal_instance;
  }
  function RevealPlugins() {
    RevealPlugins_instance = this;
  }
  function RevealPlugins$highlightJs$lambda$lambda() {
    hljs.initHighlightingOnLoad();
    return Unit;
  }
  function RevealPlugins$highlightJs$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/highlight/highlight.js';
      $receiver.async = true;
      $receiver.callback = RevealPlugins$highlightJs$lambda$lambda;
      return Unit;
    };
  }
  RevealPlugins.prototype.highlightJs_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$highlightJs$lambda(revealRoot));
  };
  function RevealPlugins$marked$lambda$lambda() {
    return document.querySelector('[data-markdown]') != null;
  }
  function RevealPlugins$marked$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/markdown/marked.js';
      $receiver.condition = RevealPlugins$marked$lambda$lambda;
      return Unit;
    };
  }
  RevealPlugins.prototype.marked_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$marked$lambda(revealRoot));
  };
  function RevealPlugins$markdown$lambda$lambda() {
    return document.querySelector('[data-markdown]') != null;
  }
  function RevealPlugins$markdown$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/markdown/markdown.js';
      $receiver.condition = RevealPlugins$markdown$lambda$lambda;
      return Unit;
    };
  }
  RevealPlugins.prototype.markdown_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$markdown$lambda(revealRoot));
  };
  function RevealPlugins$zoom$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/zoom-js/zoom.js';
      $receiver.async = true;
      return Unit;
    };
  }
  RevealPlugins.prototype.zoom_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$zoom$lambda(revealRoot));
  };
  function RevealPlugins$speakerNotes$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/notes/notes.js';
      $receiver.async = true;
      return Unit;
    };
  }
  RevealPlugins.prototype.speakerNotes_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$speakerNotes$lambda(revealRoot));
  };
  function RevealPlugins$mathJax$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/math/math.js';
      $receiver.async = true;
      return Unit;
    };
  }
  RevealPlugins.prototype.mathJax_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$mathJax$lambda(revealRoot));
  };
  function RevealPlugins$multiplex$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/multiplex/master.js';
      $receiver.async = true;
      return Unit;
    };
  }
  RevealPlugins.prototype.multiplex_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$multiplex$lambda(revealRoot));
  };
  function RevealPlugins$serverSpeakerNotes$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/notes-server/client.js';
      $receiver.async = true;
      return Unit;
    };
  }
  RevealPlugins.prototype.serverSpeakerNotes_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$serverSpeakerNotes$lambda(revealRoot));
  };
  function RevealPlugins$printPDF$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/print-pdf/print-pdf.js';
      return Unit;
    };
  }
  RevealPlugins.prototype.printPDF_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$printPDF$lambda(revealRoot));
  };
  function RevealPlugins$search$lambda(closure$revealRoot) {
    return function ($receiver) {
      $receiver.src = closure$revealRoot + '/plugin/search/search.js';
      $receiver.async = true;
      return Unit;
    };
  }
  RevealPlugins.prototype.search_61zpoe$ = function (revealRoot) {
    return revealDependency(RevealPlugins$search$lambda(revealRoot));
  };
  function RevealPlugins$socketsIoCdn$lambda($receiver) {
    $receiver.src = '//cdn.socket.io/socket.io-1.3.5.js';
    $receiver.async = true;
    return Unit;
  }
  RevealPlugins.prototype.socketsIoCdn = function () {
    return revealDependency(RevealPlugins$socketsIoCdn$lambda);
  };
  RevealPlugins.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'RevealPlugins',
    interfaces: []
  };
  var RevealPlugins_instance = null;
  function RevealPlugins_getInstance() {
    if (RevealPlugins_instance === null) {
      new RevealPlugins();
    }
    return RevealPlugins_instance;
  }
  function revealSlides$lambda($receiver) {
    return Unit;
  }
  function revealSlides$lambda_0(closure$block) {
    return function ($receiver) {
      div($receiver, 'slides', closure$block);
      return Unit;
    };
  }
  function revealSlides($receiver, block) {
    if (block === void 0)
      block = revealSlides$lambda;
    div_0($receiver, 'reveal', revealSlides$lambda_0(block));
  }
  function slide$lambda($receiver) {
    return Unit;
  }
  function slide$lambda_0(closure$id, closure$transition, closure$state, closure$transitionSpeed, closure$block) {
    return function ($receiver) {
      if (closure$id != null) {
        set_id($receiver, closure$id);
      }
      if (closure$transition != null) {
        var it = closure$transition;
        var $receiver_0 = $receiver.attributes;
        var key = 'data-transition';
        $receiver_0.put_xwzc9p$(key, it);
      }
      if (closure$state != null) {
        var it_0 = closure$state;
        var $receiver_1 = $receiver.attributes;
        var key_0 = 'data-state';
        $receiver_1.put_xwzc9p$(key_0, it_0);
      }
      if (closure$transitionSpeed != null) {
        var it_1 = closure$transitionSpeed;
        var $receiver_2 = $receiver.attributes;
        var key_1 = 'data-transition-speed';
        $receiver_2.put_xwzc9p$(key_1, it_1);
      }
      closure$block($receiver);
      return Unit;
    };
  }
  function slide($receiver, classes, id, transition, transitionSpeed, state, block) {
    if (classes === void 0)
      classes = null;
    if (id === void 0)
      id = null;
    if (transition === void 0)
      transition = null;
    if (transitionSpeed === void 0)
      transitionSpeed = null;
    if (state === void 0)
      state = null;
    if (block === void 0)
      block = slide$lambda;
    return section($receiver, classes, slide$lambda_0(id, transition, state, transitionSpeed, block));
  }
  function backgroundColor($receiver, color) {
    var $receiver_0 = $receiver.attributes;
    var key = 'data-background-color';
    $receiver_0.put_xwzc9p$(key, color);
  }
  function backgroundImage($receiver, src, size, position, repeat) {
    if (size === void 0)
      size = null;
    if (position === void 0)
      position = null;
    if (repeat === void 0)
      repeat = null;
    var $receiver_0 = $receiver.attributes;
    var key = 'data-background-image';
    $receiver_0.put_xwzc9p$(key, src);
    if (size != null) {
      var $receiver_1 = $receiver.attributes;
      var key_0 = 'data-background-size';
      $receiver_1.put_xwzc9p$(key_0, size);
    }
    if (position != null) {
      var $receiver_2 = $receiver.attributes;
      var key_1 = 'data-background-position';
      $receiver_2.put_xwzc9p$(key_1, position);
    }
    if (repeat != null) {
      var $receiver_3 = $receiver.attributes;
      var key_2 = 'data-background-repeat';
      $receiver_3.put_xwzc9p$(key_2, repeat);
    }
  }
  function backgroundVideo($receiver, src, loop, muted, size) {
    if (loop === void 0)
      loop = false;
    if (muted === void 0)
      muted = false;
    if (size === void 0)
      size = null;
    var $receiver_0 = $receiver.attributes;
    var key = 'data-background-video';
    $receiver_0.put_xwzc9p$(key, src);
    if (loop) {
      var $receiver_1 = $receiver.attributes;
      var key_0 = 'data-background-position';
      $receiver_1.put_xwzc9p$(key_0, '');
    }
    if (muted) {
      var $receiver_2 = $receiver.attributes;
      var key_1 = 'data-background-repeat';
      $receiver_2.put_xwzc9p$(key_1, '');
    }
    if (size != null) {
      var $receiver_3 = $receiver.attributes;
      var key_2 = 'data-background-size';
      $receiver_3.put_xwzc9p$(key_2, size);
    }
  }
  function backgroundIframe($receiver, href, interactive) {
    if (interactive === void 0)
      interactive = false;
    var $receiver_0 = $receiver.attributes;
    var key = 'data-background-iframe';
    $receiver_0.put_xwzc9p$(key, href);
    if (interactive) {
      var $receiver_1 = $receiver.attributes;
      var key_0 = 'data-background-interactive';
      $receiver_1.put_xwzc9p$(key_0, '');
    }
  }
  function backgroundTransition($receiver, transition) {
    var $receiver_0 = $receiver.attributes;
    var key = 'data-background-transition';
    $receiver_0.put_xwzc9p$(key, transition);
  }
  function notes($receiver, block) {
    aside($receiver, 'notes', block);
  }
  function AnimText() {
    this.spans_0 = ArrayList_init();
  }
  function AnimText$Span(classes, update) {
    this.classes = classes;
    this.update = update;
  }
  AnimText$Span.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Span',
    interfaces: []
  };
  function AnimText$span$lambda($receiver) {
    return Unit;
  }
  AnimText.prototype.span_cysewn$ = function (classes, text, update) {
    if (update === void 0)
      update = AnimText$span$lambda;
    var count = this.spans_0.size;
    this.spans_0.add_11rb$(new AnimText$Span(classes, update));
    return '@@' + count + '[' + text + ']' + count + '@@';
  };
  function AnimText$fragment$lambda($receiver) {
    return Unit;
  }
  function AnimText$fragment$lambda_0(closure$index, closure$update) {
    return function ($receiver) {
      var $receiver_0 = $receiver.attributes;
      var key = 'data-fragment-index';
      var value = closure$index.toString();
      $receiver_0.put_xwzc9p$(key, value);
      closure$update($receiver);
      return Unit;
    };
  }
  AnimText.prototype.fragment_e0hv0h$ = function (index, classes, text, update) {
    if (update === void 0)
      update = AnimText$fragment$lambda;
    return this.span_cysewn$('fragment ' + classes, text, AnimText$fragment$lambda_0(index, update));
  };
  function AnimText$applyTo$lambda$lambda$lambda(closure$match) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$(closure$match.groupValues.get_za3lpa$(1));
      return Unit;
    };
  }
  function AnimText$applyTo$lambda$lambda(closure$fragment, closure$match) {
    return function ($receiver) {
      closure$fragment.update($receiver);
      unsafe($receiver, AnimText$applyTo$lambda$lambda$lambda(closure$match));
      return Unit;
    };
  }
  AnimText.prototype.applyTo_61zpoe$ = function (orig) {
    if (this.spans_0.isEmpty())
      return orig;
    var txt = {v: orig};
    var tmp$, tmp$_0;
    var index = 0;
    tmp$ = this.spans_0.iterator();
    while (tmp$.hasNext()) {
      var item = tmp$.next();
      var index_0 = (tmp$_0 = index, index = tmp$_0 + 1 | 0, tmp$_0);
      var tmp$_1;
      tmp$_1 = Regex_init('@@' + index_0 + '\\' + '[([' + '\\' + 's' + '\\' + 'S]*)]' + index_0 + '@@', RegexOption.MULTILINE).find_905azu$(txt.v);
      if (tmp$_1 == null) {
        throw IllegalStateException_init('Could not find span ' + index_0 + ' markers');
      }
      var match = tmp$_1;
      var span_0 = span(appendHTML(new StringBuilder(), false), item.classes, AnimText$applyTo$lambda$lambda(item, match)).toString();
      var $receiver = txt.v;
      var endIndex = match.range.start;
      var tmp$_2 = $receiver.substring(0, endIndex) + span_0;
      var $receiver_0 = txt.v;
      var startIndex = match.range.endInclusive + 1 | 0;
      txt.v = tmp$_2 + $receiver_0.substring(startIndex);
    }
    return txt.v;
  };
  AnimText.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'AnimText',
    interfaces: []
  };
  function hl($receiver, index, text) {
    return $receiver.fragment_e0hv0h$(index, 'highlight-current-blue', text);
  }
  function fIn($receiver, index, text) {
    return $receiver.fragment_e0hv0h$(index, '', text);
  }
  function fOut($receiver, index, text) {
    return $receiver.fragment_e0hv0h$(index, 'fade-out', text);
  }
  function cur($receiver, index, text) {
    return $receiver.fragment_e0hv0h$(index, 'current-visible', text);
  }
  function animText($receiver, txt) {
    return txt($receiver.animText);
  }
  function hlCode$lambda($receiver) {
    return Unit;
  }
  function hlCode$lambda$lambda(closure$animText) {
    return function (element, partial) {
      if (partial)
        return;
      element.innerHTML = closure$animText.applyTo_61zpoe$(element.innerHTML);
      return Unit;
    };
  }
  function hlCode$lambda$lambda_0(closure$animText, closure$block) {
    return function ($receiver) {
      $receiver.animText = closure$animText;
      var $receiver_0 = $receiver.attributes;
      var key = 'data-trim';
      $receiver_0.put_xwzc9p$(key, '');
      var $receiver_1 = $receiver.attributes;
      var key_0 = 'data-noescape';
      $receiver_1.put_xwzc9p$(key_0, '');
      closure$block($receiver);
      return Unit;
    };
  }
  function hlCode$lambda_0(this$hlCode, closure$lang, closure$block) {
    return function ($receiver) {
      var animText = new AnimText();
      code(onFinalize(this$hlCode, hlCode$lambda$lambda(animText)), closure$lang, hlCode$lambda$lambda_0(animText, closure$block));
      return Unit;
    };
  }
  function hlCode($receiver, lang, block) {
    if (lang === void 0)
      lang = null;
    if (block === void 0)
      block = hlCode$lambda;
    pre($receiver, void 0, hlCode$lambda_0($receiver, lang, block));
  }
  function fragment$lambda(closure$classes, closure$index) {
    return function (element, partial) {
      if (partial)
        return;
      element.classList.add('fragment');
      if (closure$classes != null) {
        var $receiver = closure$classes;
        var tmp$;
        tmp$ = Regex_init_0(' +').split_905azu$($receiver, 0).iterator();
        while (tmp$.hasNext()) {
          var element_0 = tmp$.next();
          element.classList.add(element_0);
        }
      }
      if (closure$index >= 0) {
        element.dataset['fragmentIndex'] = closure$index.toString();
      }
      return Unit;
    };
  }
  function fragment($receiver, classes, index) {
    if (classes === void 0)
      classes = null;
    if (index === void 0)
      index = -1;
    return onFinalize($receiver, fragment$lambda(classes, index));
  }
  function fadeIn($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, null, index);
  }
  function grow($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'grow', index);
  }
  function shrink($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'shrink', index);
  }
  function fadeOut($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'fade-out', index);
  }
  function fadeUp($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'fade-up', index);
  }
  function curVisible($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'current-visible', index);
  }
  function highlightCurBlue($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'highlight-current-blue', index);
  }
  function highlightRed($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'highlight-red', index);
  }
  function highlightGreen($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'highlight-green', index);
  }
  function highlightBlue($receiver, index) {
    if (index === void 0)
      index = -1;
    return fragment($receiver, 'highlight-blue', index);
  }
  function lazyImg$lambda($receiver) {
    return Unit;
  }
  function lazyImg$lambda_0(closure$src, closure$block) {
    return function ($receiver) {
      if (closure$src != null) {
        var $receiver_0 = $receiver.attributes;
        var key = 'data-src';
        var value = closure$src;
        $receiver_0.put_xwzc9p$(key, value);
      }
      closure$block($receiver);
      return Unit;
    };
  }
  function lazyImg($receiver, alt, src, classes, block) {
    if (alt === void 0)
      alt = null;
    if (src === void 0)
      src = null;
    if (classes === void 0)
      classes = null;
    if (block === void 0)
      block = lazyImg$lambda;
    return img($receiver, alt, null, classes, lazyImg$lambda_0(src, block));
  }
  var package$com = _.com || (_.com = {});
  var package$github = package$com.github || (package$com.github = {});
  var package$salomonbrys = package$github.salomonbrys || (package$github.salomonbrys = {});
  var package$revealkt = package$salomonbrys.revealkt || (package$salomonbrys.revealkt = {});
  package$revealkt.revealDependency_nu6a3y$ = revealDependency;
  package$revealkt.multiplexConfig_65i588$ = multiplexConfig;
  package$revealkt.mathConfig_nu6a3y$ = mathConfig;
  Object.defineProperty(package$revealkt, 'Reveal', {
    get: Reveal_getInstance
  });
  Object.defineProperty(package$revealkt, 'RevealPlugins', {
    get: RevealPlugins_getInstance
  });
  package$revealkt.revealSlides_xt65r4$ = revealSlides;
  package$revealkt.slide_65sdy3$ = slide;
  package$revealkt.backgroundColor_o61efs$ = backgroundColor;
  package$revealkt.backgroundImage_5fx4m3$ = backgroundImage;
  package$revealkt.backgroundVideo_ex0wpx$ = backgroundVideo;
  package$revealkt.backgroundIframe_sgq5wh$ = backgroundIframe;
  package$revealkt.backgroundTransition_o61efs$ = backgroundTransition;
  package$revealkt.notes_z0ieiz$ = notes;
  package$revealkt.AnimText = AnimText;
  package$revealkt.hl_avhqks$ = hl;
  package$revealkt.fIn_avhqks$ = fIn;
  package$revealkt.fOut_avhqks$ = fOut;
  package$revealkt.cur_avhqks$ = cur;
  package$revealkt.animText_cf4n1b$ = animText;
  package$revealkt.hlCode_osm44v$ = hlCode;
  package$revealkt.fragment_mlg1sr$ = fragment;
  package$revealkt.fadeIn_h0p60k$ = fadeIn;
  package$revealkt.grow_h0p60k$ = grow;
  package$revealkt.shrink_h0p60k$ = shrink;
  package$revealkt.fadeOut_h0p60k$ = fadeOut;
  package$revealkt.fadeUp_h0p60k$ = fadeUp;
  package$revealkt.curVisible_h0p60k$ = curVisible;
  package$revealkt.highlightCurBlue_h0p60k$ = highlightCurBlue;
  package$revealkt.highlightRed_h0p60k$ = highlightRed;
  package$revealkt.highlightGreen_h0p60k$ = highlightGreen;
  package$revealkt.highlightBlue_h0p60k$ = highlightBlue;
  package$revealkt.lazyImg_66lhld$ = lazyImg;
  Kotlin.defineModule('revealkt', _);
  return _;
}));

//# sourceMappingURL=revealkt.js.map
