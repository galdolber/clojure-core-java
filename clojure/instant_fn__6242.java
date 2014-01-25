package clojure;

import clojure.lang.*;

public final class instant_fn__6242 extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 static {
  const__0 = (java.lang.Object)java.util.regex.Pattern.compile("(\\d\\d\\d\\d)(?:-(\\d\\d)(?:-(\\d\\d)(?:[T](\\d\\d)(?::(\\d\\d)(?::(\\d\\d)(?:[.](\\d+))?)?)?)?)?)?(?:[Z]|([-+])(\\d\\d):(\\d\\d))?");
 }
 public instant_fn__6242() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object timestamp1 = const__0;
   return new clojure.instant_fn__6242_fn__6243(timestamp1);
  }
 }
}
