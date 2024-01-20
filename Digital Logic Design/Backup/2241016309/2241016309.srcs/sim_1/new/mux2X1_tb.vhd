----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/13/2024 01:26:52 PM
-- Design Name: 
-- Module Name: mux2X1_tb - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity mux2X1_tb is
--  Port ( );
end mux2X1_tb;
-- E. Jagadeeswar Patro - 2241016309
architecture Behavioral of mux2X1_tb is
component mux2X1
port(A, B, S: in std_logic;
     Y: out std_logic);
end component;
signal A, B, S, Y: std_logic;
begin
uut: mux2X1 port map(A=>A, B=>B, S=>S, Y=>Y);
stimulus: process
begin
A<='0'; B<='0'; S<='0'; wait for 10ns;
A<='0'; B<='0'; S<='1';wait for 10ns;
A<='0'; B<='1'; S<='0';wait for 10ns;
A<='0'; B<='1'; S<='1';wait for 10ns;
A<='1'; B<='0'; S<='0'; wait for 10ns;
A<='1'; B<='0'; S<='1';wait for 10ns;
A<='1'; B<='1'; S<='0';wait for 10ns;
A<='1'; B<='1'; S<='1';wait for 10ns;
end process;
end Behavioral;