import com.github.salomonbrys.revealkt.*
import kotlinx.html.*
import kotlinx.html.dom.append
import kotlinx.html.js.*
import kotlin.browser.document


fun main(args: Array<String>) {

    document.body!!.append {
        revealSlides {
            div {
                id = "logoBottom"
                img(src = "imgs/logo-white.svg")
                p { b { +"KODEIN" } ; +"Koders" }
            }

            section {
                slide {
                    h2 { +"Kotlin for Android, iOS & the mobile web," }
                    img(src = "imgs/Avatar.jpg") {
                        style = "width: 15%; border-radius: 100%; box-shadow: 3px 3px 20px #555;"
                    }
                    br()
                    +"Salomon BRYS"
                    br()
                    a(href = "https://twitter.com/salomonbrys") { +"@salomonbrys" }
                }

                slide {
                    img(src = "imgs/logo-white.svg", classes = "plain") {
                        style = "height: 42%; margin-bottom: 1em;"
                    }
                    br()
                    a(href = "https://kodein.net") { +"kodein.net" }
                    +" / "
                    a(href = "https://kodein.org") { +"kodein.org" }
                    br()
                    a(href = "https://twitter.com/kodeinkoders") { +"@KodeinKoders" }
                }
            }

            section {
                slide {
                    h2 { +"Kotlin rocks!" }
                }
                slide {
                    h2 { +"Did you know?" }
                    p { +"Kotlin was NOT made for Android!" }
                }
                slide {
                    h4 { +"Mars 2017:" }
                    fragment().img(src = "imgs/kotlin-11.png") { style = "width: 10em;" }
                    br() ; br()
                    fragment().h4 { +"May 2017:" }
                    fragment().img(src = "imgs/kotlin-android.jpg") { style = "width: 10em;" }
                }
                slide {
                    img(src = "imgs/kotlin-everywhere.jpg")
                    fragment().img(src = "imgs/apple.png", classes = "plain") { id = "apple" }
                }
            }

            section {
                slide {
                    h2 { +"Why Android?" }
                    fragment().h1 { +"Duh!" }
                }
                slide {
                    h2 { +"Why iOS?" }
                    fragment().h1 { +"Duh!" }
                }
                slide {
                    h2 { +"Why Mobile Web / PWA?" }
                    fragment().img(src = "imgs/north-south.png")
                }
            }

            section {
                slide {
                    h2 { +"Code Architecture" }
                    ul {
                        style = "width: 100%;"
                        fragment(index = 1).li { +"IoC: Kodein-DI" }
                        fragment(index = 2).li {
                            +"View Separation: "
                            fragment(index = 7).span(classes = "fade-in-appear") { +"ad-hoc MVP" }
                            fragment(index = 7).span(classes = "fade-out-disappear") {
                                fragment(index = 6).span(classes = "fade-in-appear") { i { +"(Kodein-MVP in the work)" } }
                            }
                            fragment(index = 6).span(classes = "fade-out-disappear") {
                                fragment(index = 5).span(classes = "fade-in-appear") { +"MVP" }
                            }
                            fragment(index = 5).span(classes = "fade-out-disappear") {
                                fragment(index = 4).span(classes = "fade-in-appear") { +"Manageable inVulnerable Partition" }
                            }
                            fragment(index = 4).span(classes = "fade-out-disappear") {
                                fragment(index = 3).span(classes = "fade-in-appear") { +"Most Verbose Pattern" }
                            }
                            fragment(index = 3).span(classes = "fade-out-disappear") { +"MVP" }

                        }
                        fragment(index = 8).li { +"Common " ; b { +"business code" } }
                        fragment(index = 9).li {
                            +"Specific " ; b { +"UI code" }
                            ul {
                                fragment(index = 10).li {
                                    +"Android: native view system "
                                    fragment(index = 13).i(classes = "fade-in-appear") { +"in Kotlin!" }
                                }
                                fragment(index = 11).li {
                                    +"iOS: native view system "
                                    fragment(index = 14).i(classes = "fade-in-appear") { +"in Swift :(" }
                                    fragment(index = 14).span(classes = "fade-out-disappear") {
                                        fragment(index = 13).i(classes = "fade-in-appear") { +"in Kotlin!" }
                                    }
                                }
                                fragment(index = 12).li {
                                    +"Web: React "
                                    fragment(index = 13).i(classes = "fade-in-appear") { +"in Kotlin!" }
                                }
                            }
                        }
                    }
                }
                slide {
                    h2 { +"Build Architecture" }
                    div {
                        style = "position:relative; height: 510px; margin:0 auto;"

                        val imgStyle = "position: absolute; margin: auto; top: 0; left: 0; right: 0;"

                        img(src = "imgs/kmp-arch-0.png") { style = imgStyle }
                        fragment().img(src = "imgs/kmp-arch-1.png") { style = imgStyle }
                        fragment().img(src = "imgs/kmp-arch-2.png") { style = imgStyle }
                        fragment().img(src = "imgs/kmp-arch-3.png") { style = imgStyle }
                        fragment().img(src = "imgs/kmp-arch-4.png") { style = imgStyle }
                    }
                }
            }
            section {
                slide {
                    p { +"Show me some code alright!" }
                    img(src = "imgs/impatient.gif") { style = "width: 60%;" }
                }
                slide {
                    p { +"OK, OK, let's" }
                    h1 { +"CODE!" }
                }
            }
            section {
                slide {
                    h3 {
                        +"The "
                        fragment(index = 1).span(classes = "fade-in-appear") { +"Kotlin/Native" }
                        fragment(index = 1).span(classes = "fade-out-disappear") { +"Erroneous" }
                        br()
                        +" concurrency Model"
                    }
                    br()
                    p {
                        +"A datum can "
                        fragment(index = 1).b(classes = "fade-in-appear") { unsafe { +"either&nbsp;" } }
                        +"be "
                        b { +"shared " }
                        fragment(index = 1).span(classes = "fade-in-appear") { unsafe { +"or&nbsp;" } }
                        fragment(index = 1).span(classes = "fade-out-disappear") { unsafe { +"and&nbsp;" } }
                        b { +"mutable " }
                        +"!"
                        br() ; br()
                        p { +" " }
                    }
                }
                slide {
                    h3 {
                        +"The Kotlin/Native"
                        br()
                        +"concurrency Model"
                    }
                    ul {
                        style = "width: 40%;"
                        fragment().li { +"Freezing" }
                        fragment().li { +"Ownership" }
                        fragment().li { +"Ownership transfer" }
                    }
                }
                slide {
                    img(src = "imgs/nikolay.jpg") {
                        style = "width: 60%"
                    }
                }
            }

            section {
                attributes["data-background-color"] = "#46AF6D"
                attributes["data-background-image"] = "imgs/header-background.svg"

                slide {
                    div(classes = "logo") {
                        img(classes = "logo-img plain", src = "imgs/logo-white.svg")
                        div {
                            h1 {
                                b { +"KODEIN" }
                                +"Framework"
                            }
                            h2 {
                                +"painless "
                                img(classes = "plain", src = "imgs/kotlin-white.svg")
                                +" kotlin"
                            }
                        }
                    }
                }

                slide {
                    attributes["data-background-iframe"] = "https://kodein.org/"
                }
            }

            section {
                slide {
                    h1 { +"Should you?" }
                }
                slide {
                    h2 { +"What's there" }
                    ul {
                        style = "width: 40%;"
                        li { +"KotlinX Coroutines" }
                        li { +"KotlinX Serialization" }
                        li { +"KotlinX I/O" }
                        li { +"KotlinX AtomicFU" }
                        li { +"Ktor Clients" }
                        li { +"Kodein DI" }
                    }
                }
                slide {
                    h2 { +"What's comming" }
                    ul {
                        style = "width: 40%;"
                        li { +"KotlinX Files" }
                        li { +"Kodein DB" }
                        li { +"Kodein MVP" }
                        li { +"Kodein Report" }
                        fragment().li { +"???" }
                    }
                }
                slide {
                    h2 { +"Should you?" }
                    img(src = "imgs/yes.gif")
                }
            }

            section {
                slide {
                    p { +"Let" }
                    div(classes = "logo") {
                        img(classes = "logo-img plain", src = "imgs/logo-white.svg")
                        div {
                            h1 {
                                b { +"KODEIN" }
                                +"Koders"
                            }
                            h2 {
                                +"painless technology"
                            }
                        }
                    }
                    p { +"answer your questions!" }
                    br()
                    br()
                    a(href = "https://kodein.net") { +"kodein.net" }
                    +" / "
                    a(href = "https://kodein.org") { +"kodein.org" }
                    br()
                    a(href = "https://twitter.com/kodeinkoders") { +"@KodeinKoders" }
                }
            }
        }
    }

    val revealRoot = "kjs/webjars/reveal.js/3.5.0"


    Reveal.initialize {
        slideNumber = true
        history = true
        dependencies = arrayOf(
                RevealPlugins.speakerNotes(revealRoot),
                RevealPlugins.highlightJs(revealRoot)
        )
    }
}
