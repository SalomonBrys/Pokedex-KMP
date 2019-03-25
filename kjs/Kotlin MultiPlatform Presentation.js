if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'Kotlin MultiPlatform Presentation'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'Kotlin MultiPlatform Presentation'.");
}
if (typeof this['kotlinx-html-js'] === 'undefined') {
  throw new Error("Error loading module 'Kotlin MultiPlatform Presentation'. Its dependency 'kotlinx-html-js' was not found. Please, check whether 'kotlinx-html-js' is loaded prior to 'Kotlin MultiPlatform Presentation'.");
}
if (typeof revealkt === 'undefined') {
  throw new Error("Error loading module 'Kotlin MultiPlatform Presentation'. Its dependency 'revealkt' was not found. Please, check whether 'revealkt' is loaded prior to 'Kotlin MultiPlatform Presentation'.");
}
this['Kotlin MultiPlatform Presentation'] = function (_, Kotlin, $module$kotlinx_html_js, $module$revealkt) {
  'use strict';
  var ensureNotNull = Kotlin.ensureNotNull;
  var set_id = $module$kotlinx_html_js.kotlinx.html.set_id_ueiko3$;
  var img = $module$kotlinx_html_js.kotlinx.html.img_evw26v$;
  var Unit = Kotlin.kotlin.Unit;
  var b = $module$kotlinx_html_js.kotlinx.html.b_r0mnq7$;
  var p = $module$kotlinx_html_js.kotlinx.html.p_8pggrc$;
  var div = $module$kotlinx_html_js.kotlinx.html.div_ri36nr$;
  var h2 = $module$kotlinx_html_js.kotlinx.html.h2_eh5gi3$;
  var set_style = $module$kotlinx_html_js.kotlinx.html.set_style_ueiko3$;
  var br = $module$kotlinx_html_js.kotlinx.html.br_5bz84p$;
  var a = $module$kotlinx_html_js.kotlinx.html.a_gu26kr$;
  var slide = $module$revealkt.com.github.salomonbrys.revealkt.slide_65sdy3$;
  var section = $module$kotlinx_html_js.kotlinx.html.section_ac1jhf$;
  var h4 = $module$kotlinx_html_js.kotlinx.html.h4_zdyoc7$;
  var fragment = $module$revealkt.com.github.salomonbrys.revealkt.fragment_mlg1sr$;
  var img_0 = $module$kotlinx_html_js.kotlinx.html.js.img_6lw7hj$;
  var h4_0 = $module$kotlinx_html_js.kotlinx.html.js.h4_2crq26$;
  var h1 = $module$kotlinx_html_js.kotlinx.html.js.h1_1esf85$;
  var li = $module$kotlinx_html_js.kotlinx.html.js.li_525bpd$;
  var span = $module$kotlinx_html_js.kotlinx.html.js.span_x24v7w$;
  var i = $module$kotlinx_html_js.kotlinx.html.i_5g1p9k$;
  var i_0 = $module$kotlinx_html_js.kotlinx.html.js.i_5jry8x$;
  var ul = $module$kotlinx_html_js.kotlinx.html.ul_pzlyaf$;
  var h1_0 = $module$kotlinx_html_js.kotlinx.html.h1_vmej1w$;
  var h3 = $module$kotlinx_html_js.kotlinx.html.h3_agelx2$;
  var unsafe = $module$kotlinx_html_js.kotlinx.html.unsafe_vdrn79$;
  var b_0 = $module$kotlinx_html_js.kotlinx.html.js.b_x0nqqg$;
  var li_0 = $module$kotlinx_html_js.kotlinx.html.li_yzv5uh$;
  var revealSlides = $module$revealkt.com.github.salomonbrys.revealkt.revealSlides_xt65r4$;
  var append = $module$kotlinx_html_js.kotlinx.html.dom.append_k9bwru$;
  var revealkt = $module$revealkt.com.github.salomonbrys.revealkt;
  function main$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('KODEIN');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda($receiver) {
    b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda);
    $receiver.unaryPlus_pdl1vz$('Koders');
    return Unit;
  }
  function main$lambda$lambda$lambda($receiver) {
    set_id($receiver, 'logoBottom');
    img($receiver, void 0, 'imgs/logo-white.svg');
    p($receiver, void 0, main$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_0($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kotlin for Android, iOS & the mobile web,');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_1($receiver) {
    set_style($receiver, 'width: 15%; border-radius: 100%; box-shadow: 3px 3px 20px #555;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_2($receiver) {
    $receiver.unaryPlus_pdl1vz$('@salomonbrys');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_0($receiver) {
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_0);
    img($receiver, void 0, 'imgs/Avatar.jpg', void 0, main$lambda$lambda$lambda$lambda$lambda_1);
    br($receiver);
    $receiver.unaryPlus_pdl1vz$('Salomon BRYS');
    br($receiver);
    a($receiver, 'https://twitter.com/salomonbrys', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_2);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_3($receiver) {
    set_style($receiver, 'height: 42%; margin-bottom: 1em;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_4($receiver) {
    $receiver.unaryPlus_pdl1vz$('kodein.net');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_5($receiver) {
    $receiver.unaryPlus_pdl1vz$('kodein.org');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_6($receiver) {
    $receiver.unaryPlus_pdl1vz$('@KodeinKoders');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_1($receiver) {
    img($receiver, void 0, 'imgs/logo-white.svg', 'plain', main$lambda$lambda$lambda$lambda$lambda_3);
    br($receiver);
    a($receiver, 'https://kodein.net', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_4);
    $receiver.unaryPlus_pdl1vz$(' / ');
    a($receiver, 'https://kodein.org', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_5);
    br($receiver);
    a($receiver, 'https://twitter.com/kodeinkoders', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_6);
    return Unit;
  }
  function main$lambda$lambda$lambda_0(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_0);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_1);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_7($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kotlin rocks!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_2($receiver) {
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_7);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_8($receiver) {
    $receiver.unaryPlus_pdl1vz$('Did you know?');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_9($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kotlin was NOT made for Android!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_3($receiver) {
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_8);
    p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_9);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_10($receiver) {
    $receiver.unaryPlus_pdl1vz$('Mars 2017:');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_11($receiver) {
    set_style($receiver, 'width: 10em;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_12($receiver) {
    $receiver.unaryPlus_pdl1vz$('May 2017:');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_13($receiver) {
    set_style($receiver, 'width: 10em;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_4(this$) {
    return function ($receiver) {
      h4($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_10);
      img_0(fragment(this$), void 0, 'imgs/kotlin-11.png', void 0, main$lambda$lambda$lambda$lambda$lambda_11);
      br($receiver);
      br($receiver);
      h4_0(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda_12);
      img_0(fragment(this$), void 0, 'imgs/kotlin-android.jpg', void 0, main$lambda$lambda$lambda$lambda$lambda_13);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_14($receiver) {
    set_id($receiver, 'apple');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_5(this$) {
    return function ($receiver) {
      img($receiver, void 0, 'imgs/kotlin-everywhere.jpg');
      img_0(fragment(this$), void 0, 'imgs/apple.png', 'plain', main$lambda$lambda$lambda$lambda$lambda_14);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda_1(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_2);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_3);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_4(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_5(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_15($receiver) {
    $receiver.unaryPlus_pdl1vz$('Why Android?');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_16($receiver) {
    $receiver.unaryPlus_pdl1vz$('Duh!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_6(this$) {
    return function ($receiver) {
      h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_15);
      h1(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda_16);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_17($receiver) {
    $receiver.unaryPlus_pdl1vz$('Why iOS?');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_18($receiver) {
    $receiver.unaryPlus_pdl1vz$('Duh!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_7(this$) {
    return function ($receiver) {
      h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_17);
      h1(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda_18);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_19($receiver) {
    $receiver.unaryPlus_pdl1vz$('Why Mobile Web / PWA?');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_8(this$) {
    return function ($receiver) {
      h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_19);
      img_0(fragment(this$), void 0, 'imgs/north-south.png');
      return Unit;
    };
  }
  function main$lambda$lambda$lambda_2(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_6(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_7(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_8(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_20($receiver) {
    $receiver.unaryPlus_pdl1vz$('Code Architecture');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('IoC: Kodein-DI');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('ad-hoc MVP');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('(Kodein-MVP in the work)');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    i($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(this$) {
    return function ($receiver) {
      span(fragment(this$, void 0, 6), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0($receiver) {
    $receiver.unaryPlus_pdl1vz$('MVP');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1(this$) {
    return function ($receiver) {
      span(fragment(this$, void 0, 5), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1($receiver) {
    $receiver.unaryPlus_pdl1vz$('Manageable inVulnerable Partition');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_2(this$) {
    return function ($receiver) {
      span(fragment(this$, void 0, 4), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_2($receiver) {
    $receiver.unaryPlus_pdl1vz$('Most Verbose Pattern');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_3(this$) {
    return function ($receiver) {
      span(fragment(this$, void 0, 3), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_2);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_4($receiver) {
    $receiver.unaryPlus_pdl1vz$('MVP');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_0(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('View Separation: ');
      span(fragment(this$, void 0, 7), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda);
      span(fragment(this$, void 0, 7), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(this$));
      span(fragment(this$, void 0, 6), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1(this$));
      span(fragment(this$, void 0, 5), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_2(this$));
      span(fragment(this$, void 0, 4), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_3(this$));
      span(fragment(this$, void 0, 3), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_4);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_5($receiver) {
    $receiver.unaryPlus_pdl1vz$('business code');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_1($receiver) {
    $receiver.unaryPlus_pdl1vz$('Common ');
    b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_5);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_6($receiver) {
    $receiver.unaryPlus_pdl1vz$('UI code');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0($receiver) {
    $receiver.unaryPlus_pdl1vz$('in Kotlin!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_3(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('Android: native view system ');
      i_0(fragment(this$, void 0, 13), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1($receiver) {
    $receiver.unaryPlus_pdl1vz$('in Swift :(');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('in Kotlin!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_2(this$) {
    return function ($receiver) {
      i_0(fragment(this$, void 0, 13), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_4(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('iOS: native view system ');
      i_0(fragment(this$, void 0, 14), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1);
      span(fragment(this$, void 0, 14), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_2(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_3($receiver) {
    $receiver.unaryPlus_pdl1vz$('in Kotlin!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_5(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('Web: React ');
      i_0(fragment(this$, void 0, 13), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_3);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_7(this$) {
    return function ($receiver) {
      li(fragment(this$, void 0, 10), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_3(this$));
      li(fragment(this$, void 0, 11), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_4(this$));
      li(fragment(this$, void 0, 12), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_5(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_2(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('Specific ');
      b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_6);
      ul($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_7(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_21(this$) {
    return function ($receiver) {
      set_style($receiver, 'width: 100%;');
      li(fragment(this$, void 0, 1), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda);
      li(fragment(this$, void 0, 2), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_0(this$));
      li(fragment(this$, void 0, 8), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_1);
      li(fragment(this$, void 0, 9), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_2(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda_9(this$) {
    return function ($receiver) {
      h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_20);
      ul($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_21(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_22($receiver) {
    $receiver.unaryPlus_pdl1vz$('Build Architecture');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_3(closure$imgStyle) {
    return function ($receiver) {
      set_style($receiver, closure$imgStyle);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_4(closure$imgStyle) {
    return function ($receiver) {
      set_style($receiver, closure$imgStyle);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_5(closure$imgStyle) {
    return function ($receiver) {
      set_style($receiver, closure$imgStyle);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_6(closure$imgStyle) {
    return function ($receiver) {
      set_style($receiver, closure$imgStyle);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_7(closure$imgStyle) {
    return function ($receiver) {
      set_style($receiver, closure$imgStyle);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_23(this$) {
    return function ($receiver) {
      set_style($receiver, 'position:relative; height: 510px; margin:0 auto;');
      var imgStyle = 'position: absolute; margin: auto; top: 0; left: 0; right: 0;';
      img($receiver, void 0, 'imgs/kmp-arch-0.png', void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_3(imgStyle));
      img_0(fragment(this$), void 0, 'imgs/kmp-arch-1.png', void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_4(imgStyle));
      img_0(fragment(this$), void 0, 'imgs/kmp-arch-2.png', void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_5(imgStyle));
      img_0(fragment(this$), void 0, 'imgs/kmp-arch-3.png', void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_6(imgStyle));
      img_0(fragment(this$), void 0, 'imgs/kmp-arch-4.png', void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_7(imgStyle));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda_10(this$) {
    return function ($receiver) {
      h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_22);
      div($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_23(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda_3(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_9(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_10(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_24($receiver) {
    $receiver.unaryPlus_pdl1vz$('Show me some code alright!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_25($receiver) {
    set_style($receiver, 'width: 60%;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_11($receiver) {
    p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_24);
    img($receiver, void 0, 'imgs/impatient.gif', void 0, main$lambda$lambda$lambda$lambda$lambda_25);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_26($receiver) {
    $receiver.unaryPlus_pdl1vz$("OK, OK, let's");
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_27($receiver) {
    $receiver.unaryPlus_pdl1vz$('CODE!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_12($receiver) {
    p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_26);
    h1_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_27);
    return Unit;
  }
  function main$lambda$lambda$lambda_4(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_11);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_12);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_8($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kotlin/Native');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_9($receiver) {
    $receiver.unaryPlus_pdl1vz$('Erroneous');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_28(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('The ');
      span(fragment(this$, void 0, 1), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda_8);
      span(fragment(this$, void 0, 1), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda_9);
      br($receiver);
      $receiver.unaryPlus_pdl1vz$(' concurrency Model');
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_8($receiver) {
    $receiver.unaryPlus_pdl1vz$('either&nbsp;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_10($receiver) {
    unsafe($receiver, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_8);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_11($receiver) {
    $receiver.unaryPlus_pdl1vz$('shared ');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_9($receiver) {
    $receiver.unaryPlus_pdl1vz$('or&nbsp;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_12($receiver) {
    unsafe($receiver, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_9);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_10($receiver) {
    $receiver.unaryPlus_pdl1vz$('and&nbsp;');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_13($receiver) {
    unsafe($receiver, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_10);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_14($receiver) {
    $receiver.unaryPlus_pdl1vz$('mutable ');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_15($receiver) {
    $receiver.unaryPlus_pdl1vz$(' ');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_29(this$) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$('A datum can ');
      b_0(fragment(this$, void 0, 1), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda_10);
      $receiver.unaryPlus_pdl1vz$('be ');
      b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_11);
      span(fragment(this$, void 0, 1), 'fade-in-appear', main$lambda$lambda$lambda$lambda$lambda$lambda_12);
      span(fragment(this$, void 0, 1), 'fade-out-disappear', main$lambda$lambda$lambda$lambda$lambda$lambda_13);
      b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_14);
      $receiver.unaryPlus_pdl1vz$('!');
      br($receiver);
      br($receiver);
      p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_15);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda_13(this$) {
    return function ($receiver) {
      h3($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_28(this$));
      br($receiver);
      p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_29(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_30($receiver) {
    $receiver.unaryPlus_pdl1vz$('The Kotlin/Native');
    br($receiver);
    $receiver.unaryPlus_pdl1vz$('concurrency Model');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_16($receiver) {
    $receiver.unaryPlus_pdl1vz$('Freezing');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_17($receiver) {
    $receiver.unaryPlus_pdl1vz$('Ownership');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_18($receiver) {
    $receiver.unaryPlus_pdl1vz$('Ownership transfer');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_31(this$) {
    return function ($receiver) {
      set_style($receiver, 'width: 40%;');
      li(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_16);
      li(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_17);
      li(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_18);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda_14(this$) {
    return function ($receiver) {
      h3($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_30);
      ul($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_31(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_32($receiver) {
    set_style($receiver, 'width: 60%');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_15($receiver) {
    img($receiver, void 0, 'imgs/nikolay.jpg', void 0, main$lambda$lambda$lambda$lambda$lambda_32);
    return Unit;
  }
  function main$lambda$lambda$lambda_5(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_13(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_14(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_15);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_6($receiver) {
    $receiver.unaryPlus_pdl1vz$('KODEIN');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_11($receiver) {
    b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_6);
    $receiver.unaryPlus_pdl1vz$('Framework');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_12($receiver) {
    $receiver.unaryPlus_pdl1vz$('painless ');
    img($receiver, void 0, 'imgs/kotlin-white.svg', 'plain');
    $receiver.unaryPlus_pdl1vz$(' kotlin');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_19($receiver) {
    h1_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_11);
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_12);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_33($receiver) {
    img($receiver, void 0, 'imgs/logo-white.svg', 'logo-img plain');
    div($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_19);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_16($receiver) {
    div($receiver, 'logo', main$lambda$lambda$lambda$lambda$lambda_33);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_17($receiver) {
    var $receiver_0 = $receiver.attributes;
    var key = 'data-background-iframe';
    var value = 'https://kodein.org/';
    $receiver_0.put_xwzc9p$(key, value);
    return Unit;
  }
  function main$lambda$lambda$lambda_6(this$) {
    return function ($receiver) {
      var $receiver_0 = $receiver.attributes;
      var key = 'data-background-color';
      $receiver_0.put_xwzc9p$(key, '#46AF6D');
      var $receiver_1 = $receiver.attributes;
      var key_0 = 'data-background-image';
      var value = 'imgs/header-background.svg';
      $receiver_1.put_xwzc9p$(key_0, value);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_16);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_17);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_34($receiver) {
    $receiver.unaryPlus_pdl1vz$('Should you?');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_18($receiver) {
    h1_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_34);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_35($receiver) {
    $receiver.unaryPlus_pdl1vz$("What's there");
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_20($receiver) {
    $receiver.unaryPlus_pdl1vz$('KotlinX Coroutines');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_21($receiver) {
    $receiver.unaryPlus_pdl1vz$('KotlinX Serialization');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_22($receiver) {
    $receiver.unaryPlus_pdl1vz$('KotlinX I/O');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_23($receiver) {
    $receiver.unaryPlus_pdl1vz$('KotlinX AtomicFU');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_24($receiver) {
    $receiver.unaryPlus_pdl1vz$('Ktor Clients');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_25($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kodein DI');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_36($receiver) {
    set_style($receiver, 'width: 40%;');
    li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_20);
    li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_21);
    li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_22);
    li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_23);
    li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_24);
    li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_25);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_19($receiver) {
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_35);
    ul($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_36);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_37($receiver) {
    $receiver.unaryPlus_pdl1vz$("What's comming");
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_26($receiver) {
    $receiver.unaryPlus_pdl1vz$('KotlinX Files');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_27($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kodein DB');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_28($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kodein MVP');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_29($receiver) {
    $receiver.unaryPlus_pdl1vz$('Kodein Report');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_30($receiver) {
    $receiver.unaryPlus_pdl1vz$('???');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_38(this$) {
    return function ($receiver) {
      set_style($receiver, 'width: 40%;');
      li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_26);
      li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_27);
      li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_28);
      li_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_29);
      li(fragment(this$), void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_30);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda_20(this$) {
    return function ($receiver) {
      h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_37);
      ul($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_38(this$));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_39($receiver) {
    $receiver.unaryPlus_pdl1vz$('Should you?');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_21($receiver) {
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_39);
    img($receiver, void 0, 'imgs/yes.gif');
    return Unit;
  }
  function main$lambda$lambda$lambda_7(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_18);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_19);
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_20(this$));
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_21);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_40($receiver) {
    $receiver.unaryPlus_pdl1vz$('Let');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_7($receiver) {
    $receiver.unaryPlus_pdl1vz$('KODEIN');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_13($receiver) {
    b($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_7);
    $receiver.unaryPlus_pdl1vz$('Koders');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_14($receiver) {
    $receiver.unaryPlus_pdl1vz$('painless technology');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_31($receiver) {
    h1_0($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_13);
    h2($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_14);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_41($receiver) {
    img($receiver, void 0, 'imgs/logo-white.svg', 'logo-img plain');
    div($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_31);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_42($receiver) {
    $receiver.unaryPlus_pdl1vz$('answer your questions!');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_43($receiver) {
    $receiver.unaryPlus_pdl1vz$('kodein.net');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_44($receiver) {
    $receiver.unaryPlus_pdl1vz$('kodein.org');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda_45($receiver) {
    $receiver.unaryPlus_pdl1vz$('@KodeinKoders');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda_22($receiver) {
    p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_40);
    div($receiver, 'logo', main$lambda$lambda$lambda$lambda$lambda_41);
    p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_42);
    br($receiver);
    br($receiver);
    a($receiver, 'https://kodein.net', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_43);
    $receiver.unaryPlus_pdl1vz$(' / ');
    a($receiver, 'https://kodein.org', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_44);
    br($receiver);
    a($receiver, 'https://twitter.com/kodeinkoders', void 0, void 0, main$lambda$lambda$lambda$lambda$lambda_45);
    return Unit;
  }
  function main$lambda$lambda$lambda_8(this$) {
    return function ($receiver) {
      slide(this$, void 0, void 0, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda_22);
      return Unit;
    };
  }
  function main$lambda$lambda(this$) {
    return function ($receiver) {
      div($receiver, void 0, main$lambda$lambda$lambda);
      section($receiver, void 0, main$lambda$lambda$lambda_0(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_1(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_2(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_3(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_4(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_5(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_6(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_7(this$));
      section($receiver, void 0, main$lambda$lambda$lambda_8(this$));
      return Unit;
    };
  }
  function main$lambda($receiver) {
    revealSlides($receiver, main$lambda$lambda($receiver));
    return Unit;
  }
  function main$lambda_0(closure$revealRoot) {
    return function ($receiver) {
      $receiver.slideNumber = true;
      $receiver.history = true;
      $receiver.dependencies = [revealkt.RevealPlugins.speakerNotes_61zpoe$(closure$revealRoot), revealkt.RevealPlugins.highlightJs_61zpoe$(closure$revealRoot)];
      return Unit;
    };
  }
  function main(args) {
    append(ensureNotNull(document.body), main$lambda);
    var revealRoot = 'kjs/webjars/reveal.js/3.5.0';
    revealkt.Reveal.initialize_3oypv5$(main$lambda_0(revealRoot));
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('Kotlin MultiPlatform Presentation', _);
  return _;
}(typeof this['Kotlin MultiPlatform Presentation'] === 'undefined' ? {} : this['Kotlin MultiPlatform Presentation'], kotlin, this['kotlinx-html-js'], revealkt);

//# sourceMappingURL=Kotlin MultiPlatform Presentation.js.map
