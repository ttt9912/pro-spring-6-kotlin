package ch.ttt.pro_spring_6_kotlin.helloworld.plain_kt

/**
 * <p><b>object Helloworld</b></p>
 *
 * <p>This is not a class. In Kotlin, <code>object</code> declares a <b>singleton</b>. This means:</p>
 *
 * <ul>
 *     <li>Only one instance of <code>Helloworld</code> exists in the entire application.</li>
 *     <li>You do not need to instantiate it (no <code>new</code> keyword).</li>
 * </ul>
 *
 * <p>In Java, this is roughly equivalent to:</p>
 *
 * <pre>
 * public class Helloworld {
 *     public static final Helloworld INSTANCE = new Helloworld();
 *     private Helloworld() {}
 * }
 * </pre>
 *
 * <p>…but Kotlin generates all of that automatically.</p>
 *
 * <p><b>@JvmStatic</b></p>
 *
 * <p>This annotation instructs Kotlin to generate a real <code>static</code> method that Java can call normally.</p>
 *
 * <p>Without it, Java would need to call:</p>
 * <pre>Helloworld.INSTANCE.main(args);</pre>
 *
 * <p>With <code>@JvmStatic</code>, Java can use:</p>
 * <pre>Helloworld.main(args);</pre>
 *
 * <p>This makes the generated method behave just like a normal Java
 * <code>public static void main</code> method.</p>
 *
 * <p><b>Java Equivalent Code:</b></p>
 *
 * <pre>
 * public class Helloworld {
 *     public static void main(String[] array) {
 *         System.out.println("Hello World!");
 *     }
 * }
 * </pre>
 */
object Helloworld {
    @JvmStatic
    fun main(array: Array<String>) {
        println("Hello World!")
    }
}